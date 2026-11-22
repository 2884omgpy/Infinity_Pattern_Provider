package com._2884omgpy.infinitypatternprovider.init;

import appeng.api.AECapabilities;
import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

@EventBusSubscriber(modid = InfinityPatternProvider.MOD_ID)
public class AddBlockEntityToAE2Network
{
    @SubscribeEvent
    public static void ModPatternProviderConnectToAE2Network(RegisterCapabilitiesEvent event)
    {
        event.registerBlockEntity(AECapabilities.IN_WORLD_GRID_NODE_HOST, ModBlockEntities._1SLOTS_PATTERN_PROVIDER.get(), (blockEntity, side) -> blockEntity);
        event.registerBlockEntity(AECapabilities.IN_WORLD_GRID_NODE_HOST, ModBlockEntities._32SLOTS_PATTERN_PROVIDER.get(), (blockEntity, side) -> blockEntity);
        event.registerBlockEntity(AECapabilities.IN_WORLD_GRID_NODE_HOST, ModBlockEntities._1024SLOTS_PATTERN_PROVIDER.get(), (blockEntity, side) -> blockEntity);
        event.registerBlockEntity(AECapabilities.IN_WORLD_GRID_NODE_HOST, ModBlockEntities.INFINITY_PATTERN_PROVIDER.get(), (blockEntity, side) -> blockEntity);
    }
}
