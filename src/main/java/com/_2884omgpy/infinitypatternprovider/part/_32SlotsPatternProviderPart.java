package com._2884omgpy.infinitypatternprovider.part;

import appeng.api.networking.GridFlags;
import appeng.api.parts.IPartItem;
import appeng.api.stacks.AEItemKey;
import appeng.helpers.patternprovider.PatternProviderLogic;
import appeng.menu.ISubMenu;
import appeng.menu.MenuOpener;
import appeng.menu.locator.MenuHostLocator;
import appeng.parts.crafting.PatternProviderPart;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import com._2884omgpy.infinitypatternprovider.menu._32SlotsPatternProviderMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class _32SlotsPatternProviderPart extends PatternProviderPart
{
    public _32SlotsPatternProviderPart(IPartItem<?> partItem)
    {
        super(partItem);
        this.getMainNode().setFlags(GridFlags.REQUIRE_CHANNEL); //需要使用频道
    }

    //设置样板供应器槽位数量
    protected PatternProviderLogic createLogic()
    {
        return new PatternProviderLogic(this.getMainNode(), this, 32);
    }

    //打开菜单
    @Override
    public void openMenu(Player player, MenuHostLocator locator)
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
        return new ItemStack(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get());
    }

    //获取终端图标
    @Override
    public AEItemKey getTerminalIcon()
    {
        return AEItemKey.of(this.getPartItem());
    }
}
