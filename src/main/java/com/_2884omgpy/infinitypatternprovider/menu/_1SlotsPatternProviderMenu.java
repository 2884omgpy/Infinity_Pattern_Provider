package com._2884omgpy.infinitypatternprovider.menu;

import appeng.helpers.patternprovider.PatternProviderLogicHost;
import appeng.menu.implementations.MenuTypeBuilder;
import appeng.menu.implementations.PatternProviderMenu;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

public class _1SlotsPatternProviderMenu extends PatternProviderMenu
{
    public static MenuType<_1SlotsPatternProviderMenu> TYPE = MenuTypeBuilder.create(_1SlotsPatternProviderMenu::new, PatternProviderLogicHost.class).build("_1slots_pattern_provider");

    public _1SlotsPatternProviderMenu(int id, Inventory playerInventory, PatternProviderLogicHost host)
    {
        super(TYPE, id, playerInventory, host);
    }
}
