package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.menu.InfinityPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._1024SlotsPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._1SlotsPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._32SlotsPatternProviderMenu;

public class ModMenus
{
    public static void register()
    {
        _1SlotsPatternProviderMenu.init();
        _32SlotsPatternProviderMenu.init();
        _1024SlotsPatternProviderMenu.init();
        InfinityPatternProviderMenu.init();
    }
}