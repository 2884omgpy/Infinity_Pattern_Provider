package com._2884omgpy.infinitypatternprovider.init;

import appeng.core.AppEng;
import com._2884omgpy.infinitypatternprovider.menu.InfinityPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._1024SlotsPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._32SlotsPatternProviderMenu;
import net.minecraftforge.registries.ForgeRegistries;

public class ModMenus
{
    public static void register()
    {
        ForgeRegistries.MENU_TYPES.register(AppEng.makeId("_32slots_pattern_provider"), _32SlotsPatternProviderMenu.TYPE);
        ForgeRegistries.MENU_TYPES.register(AppEng.makeId("_1024slots_pattern_provider"), _1024SlotsPatternProviderMenu.TYPE);
        ForgeRegistries.MENU_TYPES.register(AppEng.makeId("infinity_pattern_provider"), InfinityPatternProviderMenu.TYPE);
    }
}