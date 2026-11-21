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

    @Override
    public InteractionResult onActivated(Level level, BlockPos pos, Player player, InteractionHand hand, @Nullable ItemStack Item, BlockHitResult result)
    {
        if (InteractionUtil.isInAlternateUseMode(player))
        {
            return InteractionResult.PASS;
        }
        else
        {
            var blockEntity = this.getBlockEntity(level, pos);
            if (blockEntity != null)
            {
                var interactionResult = check(blockEntity, Item, level, pos, result, player);
                if (interactionResult != null)
                {
                    return interactionResult;
                }
                if (!level.isClientSide())
                {
                    this.openGui(blockEntity, player);
                }
                return InteractionResult.sidedSuccess(level.isClientSide());
            }
            else
            {
                return InteractionResult.PASS;
            }
        }
    }

    public abstract void openGui(BlockEntity blockEntity, Player player);

    @Nullable
    public InteractionResult check(T blockEntity, ItemStack itemStack, Level world, BlockPos blockPosition, BlockHitResult blockHitResult, Player player)
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