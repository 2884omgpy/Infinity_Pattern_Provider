package com._2884omgpy.infinitypatternprovider.init;

import appeng.init.client.InitScreens;
import com._2884omgpy.infinitypatternprovider.menu.*;
import com._2884omgpy.infinitypatternprovider.screen.InfinityPatternProviderScreen;
import com._2884omgpy.infinitypatternprovider.screen._1024SlotsPatternProviderScreen;
import com._2884omgpy.infinitypatternprovider.screen._1SlotsPatternProviderScreen;
import com._2884omgpy.infinitypatternprovider.screen._32SlotsPatternProviderScreen;

public class ClientScreenRegister
{
    public static void registerScreens()
    {
        if (_1SlotsPatternProviderMenu.TYPE != null)
        {
            InitScreens.register(_1SlotsPatternProviderMenu.TYPE, _1SlotsPatternProviderScreen::new, "/screens/_1slots_pattern_provider.json");
        }

        if (_32SlotsPatternProviderMenu.TYPE != null)
        {
            InitScreens.register(_32SlotsPatternProviderMenu.TYPE, _32SlotsPatternProviderScreen::new, "/screens/_32slots_pattern_provider.json");
        }

        if (_1024SlotsPatternProviderMenu.TYPE != null)
        {
            InitScreens.register(_1024SlotsPatternProviderMenu.TYPE, _1024SlotsPatternProviderScreen::new, "/screens/_1024slots_pattern_provider.json");
        }

        if (InfinityPatternProviderMenu.TYPE != null)
        {
            InitScreens.register(InfinityPatternProviderMenu.TYPE, InfinityPatternProviderScreen::new, "/screens/infinity_pattern_provider.json");
        }
    }
}
