package com._2884omgpy.infinitypatternprovider.init;

import appeng.api.AECapabilities;
import appeng.api.parts.IPart;
import appeng.blockentity.networking.CableBusBlockEntity;
import appeng.core.definitions.AEBlocks;
import com._2884omgpy.infinitypatternprovider.part.InfinityPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1024SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._32SlotsPatternProviderPart;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

@EventBusSubscriber
public class CustomPatternProviderRegisterGenericHandler
{
    @SubscribeEvent
    public static void registerGENERIC_INTERNAL_INV(RegisterCapabilitiesEvent event)
    {
        event.registerBlockEntity(AECapabilities.GENERIC_INTERNAL_INV, ModBlockEntities._1SLOTS_PATTERN_PROVIDER.get(), (blockEntity, side) -> blockEntity.getLogic().getReturnInv());
        event.registerBlockEntity(AECapabilities.GENERIC_INTERNAL_INV, ModBlockEntities._32SLOTS_PATTERN_PROVIDER.get(), (blockEntity, side) -> blockEntity.getLogic().getReturnInv());
        event.registerBlockEntity(AECapabilities.GENERIC_INTERNAL_INV, ModBlockEntities._1024SLOTS_PATTERN_PROVIDER.get(), (blockEntity, side) -> blockEntity.getLogic().getReturnInv());
        event.registerBlockEntity(AECapabilities.GENERIC_INTERNAL_INV, ModBlockEntities.INFINITY_PATTERN_PROVIDER.get(), (blockEntity, side) -> blockEntity.getLogic().getReturnInv());

        event.registerBlock(AECapabilities.GENERIC_INTERNAL_INV, (level, pos, state, blockEntity, side) ->
        {
            if (blockEntity instanceof CableBusBlockEntity cableBus)
            {
                IPart part = cableBus.getCableBus().getPart(side);
                if (part instanceof _1SlotsPatternProviderPart customPatternProvider)
                {
                    return customPatternProvider.getLogic().getReturnInv();
                }
            }
            return null;
        },AEBlocks.CABLE_BUS.block());

        event.registerBlock(AECapabilities.GENERIC_INTERNAL_INV, (level, pos, state, blockEntity, side) ->
        {
            if (blockEntity instanceof CableBusBlockEntity cableBus)
            {
                IPart part = cableBus.getCableBus().getPart(side);
                if (part instanceof _32SlotsPatternProviderPart customPatternProvider)
                {
                    return customPatternProvider.getLogic().getReturnInv();
                }
            }
            return null;
        },AEBlocks.CABLE_BUS.block());

        event.registerBlock(AECapabilities.GENERIC_INTERNAL_INV, (level, pos, state, blockEntity, side) ->
        {
            if (blockEntity instanceof CableBusBlockEntity cableBus)
            {
                IPart part = cableBus.getCableBus().getPart(side);
                if (part instanceof _1024SlotsPatternProviderPart customPatternProvider)
                {
                    return customPatternProvider.getLogic().getReturnInv();
                }
            }
            return null;
        },AEBlocks.CABLE_BUS.block());

        event.registerBlock(AECapabilities.GENERIC_INTERNAL_INV, (level, pos, state, blockEntity, side) ->
        {
            if (blockEntity instanceof CableBusBlockEntity cableBus)
            {
                IPart part = cableBus.getCableBus().getPart(side);
                if (part instanceof InfinityPatternProviderPart customPatternProvider)
                {
                    return customPatternProvider.getLogic().getReturnInv();
                }
            }
            return null;
        },AEBlocks.CABLE_BUS.block());
    }
}
