package com._2884omgpy.infinitypatternprovider.datagen;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static appeng.datagen.providers.tags.ConventionTags.PATTERN_PROVIDER;

public class ModItemTagsProvider extends ItemTagsProvider
{
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider,blockTags, InfinityPatternProvider.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        //给所有物品添加AE2的#pattern_provider标签
        tag(PATTERN_PROVIDER)
                .add(ModBlocks._1SLOTS_PATTERN_PROVIDER.get().asItem())
                .add(ModBlocks._32SLOTS_PATTERN_PROVIDER.get().asItem())
                .add(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get().asItem())
                .add(ModBlocks.INFINITY_PATTERN_PROVIDER.get().asItem())
                .add(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get())
                .add(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get())
                .add(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get())
                .add(ModItems.INFINITY_PATTERN_PROVIDER_PART.get());
    }
}