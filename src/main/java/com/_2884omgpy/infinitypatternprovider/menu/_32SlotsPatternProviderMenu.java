package com._2884omgpy.infinitypatternprovider.menu;

import appeng.helpers.patternprovider.PatternProviderLogicHost;
import appeng.menu.SlotSemantics;
import appeng.menu.implementations.MenuTypeBuilder;
import appeng.menu.implementations.PatternProviderMenu;
import appeng.menu.slot.AppEngSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

import java.util.ArrayList;
import java.util.List;

public class _32SlotsPatternProviderMenu extends PatternProviderMenu
{
    public static MenuType<_32SlotsPatternProviderMenu> TYPE = MenuTypeBuilder.create(_32SlotsPatternProviderMenu::new, PatternProviderLogicHost.class).build("_32slots_pattern_provider");

    private List<AppEngSlot> patternSlots;

    public _32SlotsPatternProviderMenu(int id, Inventory playerInventory, PatternProviderLogicHost host)
    {
        super(TYPE, id, playerInventory, host);
        initializePatternSlots();
    }

    //初始化槽位列表
    private void initializePatternSlots()
    {
        patternSlots = new ArrayList<>();
        var slots = getSlots(SlotSemantics.ENCODED_PATTERN);
        for (var slot : slots)
        {
            if (slot instanceof AppEngSlot appEngSlot)
            {
                patternSlots.add(appEngSlot);
            }
        }
    }

    //获取所有模式槽位
    public List<AppEngSlot> getPatternSlots()
    {
        return patternSlots;
    }
}