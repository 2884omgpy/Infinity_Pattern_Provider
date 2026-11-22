package com._2884omgpy.infinitypatternprovider.init;

import appeng.init.client.InitScreens;
import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.menu.*;
import com._2884omgpy.infinitypatternprovider.screen.InfinityPatternProviderScreen;
import com._2884omgpy.infinitypatternprovider.screen._1024SlotsPatternProviderScreen;
import com._2884omgpy.infinitypatternprovider.screen._1SlotsPatternProviderScreen;
import com._2884omgpy.infinitypatternprovider.screen._32SlotsPatternProviderScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@EventBusSubscriber(modid = InfinityPatternProvider.MOD_ID, value = Dist.CLIENT)
public class ClientScreenRegister
{
    @SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event)
    {
        InitScreens.register(event,_1SlotsPatternProviderMenu.TYPE, _1SlotsPatternProviderScreen::new, "/screens/_1slots_pattern_provider.json");
        InitScreens.register(event,_32SlotsPatternProviderMenu.TYPE, _32SlotsPatternProviderScreen::new, "/screens/_32slots_pattern_provider.json");
        InitScreens.register(event,_1024SlotsPatternProviderMenu.TYPE, _1024SlotsPatternProviderScreen::new, "/screens/_1024slots_pattern_provider.json");
        InitScreens.register(event,InfinityPatternProviderMenu.TYPE, InfinityPatternProviderScreen::new, "/screens/infinity_pattern_provider.json");
    }
}