package com._2884omgpy.infinitypatternprovider.blockentity;

import appeng.api.stacks.AEItemKey;
import appeng.blockentity.crafting.PatternProviderBlockEntity;
import appeng.helpers.patternprovider.PatternProviderLogic;
import appeng.menu.ISubMenu;
import appeng.menu.MenuOpener;
import appeng.menu.locator.MenuLocator;
import com._2884omgpy.infinitypatternprovider.init.ModBlockEntities;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import com._2884omgpy.infinitypatternprovider.menu._32SlotsPatternProviderMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

public class _32SlotsPatternProviderBlockEntity extends PatternProviderBlockEntity
{
    public _32SlotsPatternProviderBlockEntity(BlockPos pos, BlockState blockState)
    {
        super(ModBlockEntities._32SLOTS_PATTERN_PROVIDER.get(), pos, blockState);
    }

    //设置样板供应器槽位数量
    @Override
    protected PatternProviderLogic createLogic()
    {
        return new PatternProviderLogic(this.getMainNode(), this, 32);
    }

    //打开菜单
    @Override
    public void openMenu(Player player, MenuLocator locator)
    {
        MenuOpener.open(_32SlotsPatternProviderMenu.TYPE, player, locator);
    }

    //返回至主菜单
    @Override
    public void returnToMainMenu(Player player, ISubMenu subMenu)
    {
        MenuOpener.returnTo(_32SlotsPatternProviderMenu.TYPE, player, subMenu.getLocator());
    }

    //获取返回主菜单按键图标
    @Override
    public ItemStack getMainMenuIcon()
    {
        return new ItemStack(ModBlocks._32SLOTS_PATTERN_PROVIDER.get());
    }

    //获取终端图标
    @Override
    public AEItemKey getTerminalIcon()
    {
        return AEItemKey.of(ModBlocks._32SLOTS_PATTERN_PROVIDER.get());
    }

    //设置在网络信息界面中显示的图标为当前方块物品
    @Override
    public void onReady()
    {
        super.onReady();
        this.getMainNode().setVisualRepresentation(new ItemStack(ModBlocks._32SLOTS_PATTERN_PROVIDER.get()));
    }
}