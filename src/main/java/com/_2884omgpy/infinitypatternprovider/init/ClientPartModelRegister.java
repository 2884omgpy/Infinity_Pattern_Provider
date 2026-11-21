package com._2884omgpy.infinitypatternprovider.init;

import appeng.api.parts.PartModels;
import com._2884omgpy.infinitypatternprovider.part.InfinityPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1024SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._32SlotsPatternProviderPart;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

public class ClientPartModelRegister
{
    public static void init()
    {
        FMLJavaModLoadingContext.get().getModEventBus().register(ClientPartModelRegister.class);
    }

    private static boolean registered = false;

    //注册AE2线缆组件部分
    @SubscribeEvent
    public static void PartModelRegister(RegisterEvent event)
    {
        if (registered)
        {
            return;
        }

        PartModels.registerModels(_1SlotsPatternProviderPart._1SLOTS_PATTERN_PROVIDER_BASE, _1SlotsPatternProviderPart.AE2_INTERFACE_OFF, _1SlotsPatternProviderPart.AE2_INTERFACE_ON, _1SlotsPatternProviderPart.AE2_INTERFACE_HAS_CHANNEL);
        PartModels.registerModels(_32SlotsPatternProviderPart._32SLOTS_PATTERN_PROVIDER_BASE, _32SlotsPatternProviderPart.AE2_INTERFACE_OFF, _32SlotsPatternProviderPart.AE2_INTERFACE_ON, _32SlotsPatternProviderPart.AE2_INTERFACE_HAS_CHANNEL);
        PartModels.registerModels(_1024SlotsPatternProviderPart._1024SLOTS_PATTERN_PROVIDER_BASE, _1024SlotsPatternProviderPart.AE2_INTERFACE_OFF, _1024SlotsPatternProviderPart.AE2_INTERFACE_ON, _1024SlotsPatternProviderPart.AE2_INTERFACE_HAS_CHANNEL);
        PartModels.registerModels(InfinityPatternProviderPart.INFINITY_PATTERN_PROVIDER_BASE, InfinityPatternProviderPart.AE2_INTERFACE_OFF, InfinityPatternProviderPart.AE2_INTERFACE_ON, InfinityPatternProviderPart.AE2_INTERFACE_HAS_CHANNEL);

        registered = true;
    }


}
