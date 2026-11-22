package com._2884omgpy.infinitypatternprovider;

import com._2884omgpy.infinitypatternprovider.init.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(InfinityPatternProvider.MOD_ID)
public class InfinityPatternProvider
{
    public static final String MOD_ID = "infinitypatternprovider";

    public InfinityPatternProvider(IEventBus modEventBus, ModContainer modContainer)
    {
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModMenus.MENU_TYPES.register(modEventBus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> BindBlockAndBlockEntity.bindAll());
    }
}
