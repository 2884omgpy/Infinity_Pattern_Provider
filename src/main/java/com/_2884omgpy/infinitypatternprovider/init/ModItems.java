package com._2884omgpy.infinitypatternprovider.init;

import appeng.items.parts.PartItem;
import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.part.InfinityPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1024SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._32SlotsPatternProviderPart;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfinityPatternProvider.MOD_ID);

    public static final RegistryObject<Item> _1SLOTS_PATTERN_PROVIDER =  ITEMS.register("_1slots_pattern_provider", () -> new BlockItem(ModBlocks._1SLOTS_PATTERN_PROVIDER.get(), new Item.Properties()));
    public static final RegistryObject<Item> _32SLOTS_PATTERN_PROVIDER =  ITEMS.register("_32slots_pattern_provider", () -> new BlockItem(ModBlocks._32SLOTS_PATTERN_PROVIDER.get(), new Item.Properties()));
    public static final RegistryObject<Item> _1024SLOTS_PATTERN_PROVIDER = ITEMS.register("_1024slots_pattern_provider", () -> new BlockItem(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get(), new Item.Properties()));
    public static final RegistryObject<Item> INFINITY_PATTERN_PROVIDER = ITEMS.register("infinity_pattern_provider", () -> new BlockItem(ModBlocks.INFINITY_PATTERN_PROVIDER.get(), new Item.Properties()));

    public static final RegistryObject<Item> _1SLOTS_PATTERN_PROVIDER_PART = ITEMS.register("_1slots_pattern_provider_part", () -> new PartItem<_1SlotsPatternProviderPart>(new Item.Properties(), _1SlotsPatternProviderPart.class, _1SlotsPatternProviderPart::new));
    public static final RegistryObject<Item> _32SLOTS_PATTERN_PROVIDER_PART = ITEMS.register("_32slots_pattern_provider_part", () -> new PartItem<_32SlotsPatternProviderPart>(new Item.Properties(), _32SlotsPatternProviderPart.class, _32SlotsPatternProviderPart::new));
    public static final RegistryObject<Item> _1024SLOTS_PATTERN_PROVIDER_PART = ITEMS.register("_1024slots_pattern_provider_part", () -> new PartItem<_1024SlotsPatternProviderPart>(new Item.Properties(), _1024SlotsPatternProviderPart.class, _1024SlotsPatternProviderPart::new));
    public static final RegistryObject<Item> INFINITY_PATTERN_PROVIDER_PART = ITEMS.register("infinity_pattern_provider_part", () -> new PartItem<InfinityPatternProviderPart>(new Item.Properties(),InfinityPatternProviderPart.class, InfinityPatternProviderPart::new));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
