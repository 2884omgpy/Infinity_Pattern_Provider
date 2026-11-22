package com._2884omgpy.infinitypatternprovider.init;

import appeng.block.AEBaseBlock;
import appeng.core.definitions.AEBlocks;
import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.block.InfinityPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1024SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._32SlotsPatternProviderBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(InfinityPatternProvider.MOD_ID);

    public static final DeferredBlock<_1SlotsPatternProviderBlock> _1SLOTS_PATTERN_PROVIDER = BLOCKS.registerBlock("_1slots_pattern_provider", _1SlotsPatternProviderBlock::new, AEBaseBlock::metalProps);
    public static final DeferredBlock<_32SlotsPatternProviderBlock> _32SLOTS_PATTERN_PROVIDER = BLOCKS.registerBlock("_32slots_pattern_provider", _32SlotsPatternProviderBlock::new, AEBaseBlock::metalProps);
    public static final DeferredBlock<_1024SlotsPatternProviderBlock> _1024SLOTS_PATTERN_PROVIDER = BLOCKS.registerBlock("_1024slots_pattern_provider", _1024SlotsPatternProviderBlock::new, AEBaseBlock::metalProps);
    public static final DeferredBlock<InfinityPatternProviderBlock> INFINITY_PATTERN_PROVIDER = BLOCKS.registerBlock("infinity_pattern_provider", InfinityPatternProviderBlock::new, AEBaseBlock::metalProps);
}
