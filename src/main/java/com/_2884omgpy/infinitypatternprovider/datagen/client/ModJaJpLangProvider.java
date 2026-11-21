package com._2884omgpy.infinitypatternprovider.datagen.client;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModJaJpLangProvider extends LanguageProvider
{
    public ModJaJpLangProvider(PackOutput output)
    {
        super(output, InfinityPatternProvider.MOD_ID,"ja_jp");
    }

    @Override
    protected void addTranslations()
    {
        add(ModBlocks._1SLOTS_PATTERN_PROVIDER.get(), "ME1スロットパターンプロバイダー");
        add(ModBlocks._32SLOTS_PATTERN_PROVIDER.get(), "ME32スロットパターンプロバイダー");
        add(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get(), "ME1024スロットパターンプロバイダー");
        add(ModBlocks.INFINITY_PATTERN_PROVIDER.get(), "ME無限スロットパターンプロバイダー");

        add(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get(), "ME1スロットパターンプロバイダー");
        add(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get(), "ME32スロットパターンプロバイダー");
        add(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get(), "ME1024スロットパターンプロバイダー");
        add(ModItems.INFINITY_PATTERN_PROVIDER_PART.get(), "ME無限スロットパターンプロバイダー");

        add("itemGroup.infinity_pattern_provider_creative_tab", "ME無限スロットパターンプロバイダー");

        add("gui.infinitypatternprovider._1slots_pattern_provider", "ME1スロットパターンプロバイダー");
        add("gui.infinitypatternprovider._32slots_pattern_provider", "ME32スロットパターンプロバイダー");
        add("gui.infinitypatternprovider._1024slots_pattern_provider", "ME1024スロットパターンプロバイダー");
        add("gui.infinitypatternprovider.infinity_pattern_provider", "ME無限スロットパターンプロバイダー");

        add("gui.infinitypatternprovider.prev_page", "前のページ");
        add("gui.infinitypatternprovider.next_page", "次ページ");
    }
}
