package com._2884omgpy.infinitypatternprovider.datagen.server;

import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import java.util.Set;

public class ModBlockLootTablesProvider extends BlockLootSubProvider
{
    public ModBlockLootTablesProvider()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
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
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;   //返回迭代器
    }
}
