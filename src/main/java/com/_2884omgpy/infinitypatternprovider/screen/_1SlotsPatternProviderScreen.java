package com._2884omgpy.infinitypatternprovider.screen;

import appeng.client.gui.implementations.PatternProviderScreen;
import appeng.client.gui.style.ScreenStyle;
import com._2884omgpy.infinitypatternprovider.menu._1SlotsPatternProviderMenu;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class _1SlotsPatternProviderScreen extends PatternProviderScreen<_1SlotsPatternProviderMenu>
{
    public _1SlotsPatternProviderScreen(_1SlotsPatternProviderMenu menu, Inventory playerInventory, Component title, ScreenStyle style)
    {
        super(menu, playerInventory, title, style);
    }
}
