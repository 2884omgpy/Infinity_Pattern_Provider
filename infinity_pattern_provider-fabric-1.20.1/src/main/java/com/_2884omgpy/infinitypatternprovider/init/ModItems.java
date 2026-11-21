package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.part.InfinityPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1024SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._32SlotsPatternProviderPart;
import appeng.items.parts.PartItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems
{
    public static final Item _1SLOTS_PATTERN_PROVIDER_PART = new PartItem<>(new Item.Properties(), _1SlotsPatternProviderPart.class, _1SlotsPatternProviderPart::new);
    public static final Item _32SLOTS_PATTERN_PROVIDER_PART = new PartItem<>(new Item.Properties(), _32SlotsPatternProviderPart.class, _32SlotsPatternProviderPart::new);
    public static final Item _1024SLOTS_PATTERN_PROVIDER_PART = new PartItem<>(new Item.Properties(), _1024SlotsPatternProviderPart.class, _1024SlotsPatternProviderPart::new);
    public static final Item INFINITY_PATTERN_PROVIDER_PART = new PartItem<>(new Item.Properties(), InfinityPatternProviderPart.class, InfinityPatternProviderPart::new);

    public static void register()
    {
        registerItem("_1slots_pattern_provider_part", _1SLOTS_PATTERN_PROVIDER_PART);
        registerItem("_32slots_pattern_provider_part", _32SLOTS_PATTERN_PROVIDER_PART);
        registerItem("_1024slots_pattern_provider_part", _1024SLOTS_PATTERN_PROVIDER_PART);
        registerItem("infinity_pattern_provider_part", INFINITY_PATTERN_PROVIDER_PART);
    }

    private static void registerItem(String itemID, Item item)
    {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(InfinityPatternProvider.MOD_ID, itemID), item);
    }
}