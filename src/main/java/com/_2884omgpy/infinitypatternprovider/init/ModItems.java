package com._2884omgpy.infinitypatternprovider.init;

import appeng.items.parts.PartItem;
import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.part.InfinityPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1024SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._1SlotsPatternProviderPart;
import com._2884omgpy.infinitypatternprovider.part._32SlotsPatternProviderPart;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(InfinityPatternProvider.MOD_ID);

    public static final DeferredItem<BlockItem> _1SLOTS_PATTERN_PROVIDER = ITEMS.registerSimpleBlockItem("_1slots_pattern_provider", ModBlocks._1SLOTS_PATTERN_PROVIDER);
    public static final DeferredItem<BlockItem> _32SLOTS_PATTERN_PROVIDER = ITEMS.registerSimpleBlockItem("_32slots_pattern_provider", ModBlocks._32SLOTS_PATTERN_PROVIDER);
    public static final DeferredItem<BlockItem> _1024SLOTS_PATTERN_PROVIDER = ITEMS.registerSimpleBlockItem("_1024slots_pattern_provider", ModBlocks._1024SLOTS_PATTERN_PROVIDER);
    public static final DeferredItem<BlockItem> INFINITY_PATTERN_PROVIDER = ITEMS.registerSimpleBlockItem("infinity_pattern_provider", ModBlocks.INFINITY_PATTERN_PROVIDER);

    public static final DeferredItem<PartItem<_1SlotsPatternProviderPart>> _1SLOTS_PATTERN_PROVIDER_PART = ITEMS.registerItem("_1slots_pattern_provider_part", props -> new PartItem<>(props, _1SlotsPatternProviderPart.class, _1SlotsPatternProviderPart::new), Item.Properties::new);
    public static final DeferredItem<PartItem<_32SlotsPatternProviderPart>> _32SLOTS_PATTERN_PROVIDER_PART = ITEMS.registerItem("_32slots_pattern_provider_part", props -> new PartItem<>(props, _32SlotsPatternProviderPart.class, _32SlotsPatternProviderPart::new), Item.Properties::new);
    public static final DeferredItem<PartItem<_1024SlotsPatternProviderPart>> _1024SLOTS_PATTERN_PROVIDER_PART = ITEMS.registerItem("_1024slots_pattern_provider_part", props -> new PartItem<>(props, _1024SlotsPatternProviderPart.class, _1024SlotsPatternProviderPart::new), Item.Properties::new);
    public static final DeferredItem<PartItem<InfinityPatternProviderPart>> INFINITY_PATTERN_PROVIDER_PART = ITEMS.registerItem("infinity_pattern_provider_part", props -> new PartItem<>(props, InfinityPatternProviderPart.class, InfinityPatternProviderPart::new), Item.Properties::new);
}
