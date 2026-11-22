package com._2884omgpy.infinitypatternprovider.menu;

import appeng.helpers.patternprovider.PatternProviderLogicHost;
import appeng.menu.SlotSemantics;
import appeng.menu.implementations.MenuTypeBuilder;
import appeng.menu.implementations.PatternProviderMenu;
import appeng.menu.slot.AppEngSlot;
import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

import java.util.ArrayList;
import java.util.List;

public class _1024SlotsPatternProviderMenu extends PatternProviderMenu
{
    public static MenuType<_1024SlotsPatternProviderMenu> TYPE;

    private List<AppEngSlot> patternSlots;

    public static void init()
    {
        TYPE = MenuTypeBuilder.create(_1024SlotsPatternProviderMenu::new, PatternProviderLogicHost.class).buildUnregistered(Identifier.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "_1024slots_pattern_provider"));
    }

    public _1024SlotsPatternProviderMenu(int id, Inventory playerInventory, PatternProviderLogicHost host)
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