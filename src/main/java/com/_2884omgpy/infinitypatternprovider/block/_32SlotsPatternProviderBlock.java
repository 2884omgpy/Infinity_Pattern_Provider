package com._2884omgpy.infinitypatternprovider.block;

import appeng.block.crafting.PushDirection;
import appeng.menu.locator.MenuLocators;
import appeng.util.InteractionUtil;
import com._2884omgpy.infinitypatternprovider.blockentity._32SlotsPatternProviderBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import static appeng.block.crafting.PatternProviderBlock.PUSH_DIRECTION;

public class _32SlotsPatternProviderBlock extends CustomPatternProviderBlock<_32SlotsPatternProviderBlockEntity>
{
    public _32SlotsPatternProviderBlock()
    {
        super(metalProps());
        this.registerDefaultState(this.defaultBlockState().setValue(PUSH_DIRECTION, PushDirection.ALL));
    }

    //检测周围方块更新
    @Override
    public void neighborChanged(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPosition, @NotNull Block block, @NotNull BlockPos fromPosition, boolean isMoving)
    {
        var blockEntity = this.getBlockEntity(level, blockPosition);
        if (blockEntity != null)
        {
            blockEntity.getLogic().updateRedstoneState();
        }
    }

    //交互结果
    @Override
    public InteractionResult check(_32SlotsPatternProviderBlockEntity blockEntity, ItemStack itemStack, Level world, BlockPos blockPosition, BlockHitResult blockHitResult, Player player)
    {
        if (itemStack != null && InteractionUtil.canWrenchRotate(itemStack))
        {
            super.setSide(world, blockPosition, blockHitResult.getDirection());
            return InteractionResult.sidedSuccess(world.isClientSide());
        }
        return null;
    }

    //打开GUI
    @Override
    public void openGui(BlockEntity blockEntity, Player player)
    {
        if (blockEntity instanceof _32SlotsPatternProviderBlockEntity patternProvider)
        {
            patternProvider.openMenu(player, MenuLocators.forBlockEntity(patternProvider));
        }
    }
}
