package com._2884omgpy.infinitypatternprovider.datagen;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.datagen.client.*;
import com._2884omgpy.infinitypatternprovider.datagen.server.ModBlockLootTablesProvider;
import com._2884omgpy.infinitypatternprovider.datagen.server.ModBlockTagsProvider;
import com._2884omgpy.infinitypatternprovider.datagen.server.ModItemTagsProvider;
import com._2884omgpy.infinitypatternprovider.datagen.server.ModRecipesProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = InfinityPatternProvider.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerater
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        //服务端数据生成
        if (event.includeServer())
        {
            //物品配方
            generator.addProvider(true, new ModRecipesProvider(packOutput));

            //物品战利品列表
            generator.addProvider(true, new LootTableProvider(packOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTablesProvider::new, LootContextParamSets.BLOCK))));

            //方块标签
            BlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(packOutput, lookupProvider, existingFileHelper);
            generator.addProvider(true, blockTagsProvider);

            //物品标签
            generator.addProvider(true, new ModItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        }

        //客户端数据生成
        if (event.includeClient())
        {
            generator.addProvider(true, new ModEnUsLangProvider(packOutput));
            generator.addProvider(true, new ModZhCnLangProvider(packOutput));
            generator.addProvider(true, new ModZhTwLangProvider(packOutput));
            generator.addProvider(true, new ModRuRuLangProvider(packOutput));
            generator.addProvider(true, new ModJaJpLangProvider(packOutput));
            generator.addProvider(true, new ModKoKrLangProvider(packOutput));
        }
    }
}
