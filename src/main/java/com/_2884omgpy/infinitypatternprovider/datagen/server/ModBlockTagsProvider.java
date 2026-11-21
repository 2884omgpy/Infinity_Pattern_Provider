package com._2884omgpy.infinitypatternprovider.datagen.server;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, InfinityPatternProvider.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks._1SLOTS_PATTERN_PROVIDER.get())
                .add(ModBlocks._32SLOTS_PATTERN_PROVIDER.get())
                .add(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get())
                .add(ModBlocks.INFINITY_PATTERN_PROVIDER.get());
    }
}
