package com._2884omgpy.infinitypatternprovider.datagen;

import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTablesProvider extends BlockLootSubProvider
{
    protected ModBlockLootTablesProvider(HolderLookup.Provider registries)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate()
    {
        dropSelf(ModBlocks._1SLOTS_PATTERN_PROVIDER.get());
        dropSelf(ModBlocks._32SLOTS_PATTERN_PROVIDER.get());
        dropSelf(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get());
        dropSelf(ModBlocks.INFINITY_PATTERN_PROVIDER.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;   //返回迭代器
    }
}
