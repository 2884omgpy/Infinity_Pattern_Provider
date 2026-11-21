package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.block.InfinityPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1024SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._32SlotsPatternProviderBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModBlocks
{
    public static final Block _1SLOTS_PATTERN_PROVIDER = new _1SlotsPatternProviderBlock();
    public static final Block _32SLOTS_PATTERN_PROVIDER = new _32SlotsPatternProviderBlock();
    public static final Block _1024SLOTS_PATTERN_PROVIDER = new _1024SlotsPatternProviderBlock();
    public static final Block INFINITY_PATTERN_PROVIDER = new InfinityPatternProviderBlock();

    public static void register()
    {
        registerBlockWithItem("_1slots_pattern_provider", _1SLOTS_PATTERN_PROVIDER);
        registerBlockWithItem("_32slots_pattern_provider", _32SLOTS_PATTERN_PROVIDER);
        registerBlockWithItem("_1024slots_pattern_provider", _1024SLOTS_PATTERN_PROVIDER);
        registerBlockWithItem("infinity_pattern_provider", INFINITY_PATTERN_PROVIDER);
    }

    private static void registerBlockWithItem(String path, Block block)
    {
        ResourceLocation id = new ResourceLocation(InfinityPatternProvider.MOD_ID, path);
        Registry.register(BuiltInRegistries.BLOCK, id, block);
        Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties()));
    }
}