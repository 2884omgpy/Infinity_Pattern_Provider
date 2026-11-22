package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.block.InfinityPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1024SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._32SlotsPatternProviderBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(InfinityPatternProvider.MOD_ID);

    public static final DeferredBlock<_1SlotsPatternProviderBlock> _1SLOTS_PATTERN_PROVIDER = BLOCKS.register("_1slots_pattern_provider", registryName -> new _1SlotsPatternProviderBlock());
    public static final DeferredBlock<_32SlotsPatternProviderBlock> _32SLOTS_PATTERN_PROVIDER = BLOCKS.register("_32slots_pattern_provider", registryName -> new _32SlotsPatternProviderBlock());
    public static final DeferredBlock<_1024SlotsPatternProviderBlock> _1024SLOTS_PATTERN_PROVIDER = BLOCKS.register("_1024slots_pattern_provider", registryName -> new _1024SlotsPatternProviderBlock());
    public static final DeferredBlock<InfinityPatternProviderBlock> INFINITY_PATTERN_PROVIDER = BLOCKS.register("infinity_pattern_provider", registryName -> new InfinityPatternProviderBlock());
}
