package com._2884omgpy.infinitypatternprovider.block;

import appeng.block.AEBaseEntityBlock;
import appeng.block.crafting.PushDirection;
import appeng.blockentity.AEBaseBlockEntity;
import appeng.util.InteractionUtil;
import appeng.util.Platform;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static appeng.block.crafting.PatternProviderBlock.PUSH_DIRECTION;

public abstract class CustomPatternProviderBlock<T extends AEBaseBlockEntity> extends AEBaseEntityBlock<T>
{
    public CustomPatternProviderBlock(BlockBehaviour.Properties props)
    {
        super(props);
    }

    //手上有物品时的交互
    @Override
    public ItemInteractionResult useItemOn(ItemStack heldItem, BlockState blockState, Level level, BlockPos blockPosition, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult)
    {
        //先让父类处理原生交互（内存卡等），如果父类已处理则直接返回结果
        ItemInteractionResult superResult = super.useItemOn(heldItem, blockState, level, blockPosition, player, interactionHand, blockHitResult);
        if (superResult != ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION)
        {
            return superResult;
        }

        //潜行时，不打开GUI，当成普通方块处理
        if (InteractionUtil.isInAlternateUseMode(player))
        {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        //当不是BlockEntity的时候当成普通方块处理
        T blockEntity = this.getBlockEntity(level, blockPosition);
        if (blockEntity == null)
        {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        //检查扳手等特殊物品交互（如果有特殊处理，直接返回结果）
        ItemInteractionResult wrenchResult = checkPlayerInteractionWhenUseItem(blockEntity, heldItem, level, blockPosition, blockHitResult, player);
        if (wrenchResult != null)
        {
            return wrenchResult;
        }

        //打开GUI（仅在服务端执行）
        if (!level.isClientSide)
        {
            this.openGui(blockEntity, player);
        }
        //无论客户端还是服务端，都返回“成功”结果，阻止原版放置方块的预测逻辑
        return ItemInteractionResult.sidedSuccess(level.isClientSide);
    }

    //空手交互
    @Override
    protected InteractionResult useWithoutItem(BlockState blockState, Level level, BlockPos blockPosition, Player player, BlockHitResult blockHitResult)
    {
        if (InteractionUtil.isInAlternateUseMode(player))
        {
            return InteractionResult.PASS;
        }

        var blockEntity = this.getBlockEntity(level, blockPosition);
        if (blockEntity != null)
        {
            if (!level.isClientSide)
            {
                openGui(blockEntity, player);
            }
            return InteractionResult.CONSUME;
        }
        else
        {
            return InteractionResult.PASS;
        }
    }

    public abstract void openGui(BlockEntity blockEntity, Player player);

    @Nullable
    public ItemInteractionResult checkPlayerInteractionWhenUseItem(T blockEntity, ItemStack itemStack, Level world, BlockPos blockPosition, BlockHitResult blockHitResult, Player player)
    {
        return null;
    }

    //添加push方向
    @Override
    protected void createBlockStateDefinition(@NotNull StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(PUSH_DIRECTION);
    }

    //设置方向
    public void setSide(Level level, BlockPos blockPosition, Direction facingDirection)
    {
        var currentState = level.getBlockState(blockPosition);
        var pushSide = currentState.getValue(PUSH_DIRECTION).getDirection();

        PushDirection newPushDirection;
        if (pushSide == facingDirection.getOpposite())   //背对>>>面对
        {
            newPushDirection = PushDirection.fromDirection(facingDirection);
        }
        else
            if (pushSide == facingDirection)             //面对>>>全部
            {
                newPushDirection = PushDirection.ALL;
            }
            else
                if (pushSide == null)                   //无方向>>>背对
                {
                    newPushDirection = PushDirection.fromDirection(facingDirection.getOpposite());
                }
                    else                                //旋转
                    {
                        newPushDirection = PushDirection.fromDirection(Platform.rotateAround(pushSide, facingDirection));
                    }

        //方块更新
        level.setBlockAndUpdate(blockPosition, currentState.setValue(PUSH_DIRECTION, newPushDirection));
    }

}