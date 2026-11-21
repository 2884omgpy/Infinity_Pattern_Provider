package com._2884omgpy.infinitypatternprovider.init;

import appeng.api.parts.PartModels;
import com._2884omgpy.infinitypatternprovider.part.InfinityPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1024SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._32SlotsPatternProviderPart;

public class ClientPartModelRegister
{
    private static boolean isModelPartsRegistered = false;
    public static void registerPartModels()
    {
        if (!isModelPartsRegistered)
        {
            PartModels.registerModels(_1SlotsPatternProviderPart._1SLOTS_PATTERN_PROVIDER_BASE, _1SlotsPatternProviderPart.AE2_INTERFACE_OFF, _1SlotsPatternProviderPart.AE2_INTERFACE_ON, _1SlotsPatternProviderPart.AE2_INTERFACE_HAS_CHANNEL);
            PartModels.registerModels(_32SlotsPatternProviderPart._32SLOTS_PATTERN_PROVIDER_BASE, _32SlotsPatternProviderPart.AE2_INTERFACE_OFF, _32SlotsPatternProviderPart.AE2_INTERFACE_ON, _32SlotsPatternProviderPart.AE2_INTERFACE_HAS_CHANNEL);
            PartModels.registerModels(_1024SlotsPatternProviderPart._1024SLOTS_PATTERN_PROVIDER_BASE, _1024SlotsPatternProviderPart.AE2_INTERFACE_OFF, _1024SlotsPatternProviderPart.AE2_INTERFACE_ON, _1024SlotsPatternProviderPart.AE2_INTERFACE_HAS_CHANNEL);
            PartModels.registerModels(InfinityPatternProviderPart.INFINITY_PATTERN_PROVIDER_BASE, InfinityPatternProviderPart.AE2_INTERFACE_OFF, InfinityPatternProviderPart.AE2_INTERFACE_ON, InfinityPatternProviderPart.AE2_INTERFACE_HAS_CHANNEL);
            isModelPartsRegistered = true;
        }
    }
}
