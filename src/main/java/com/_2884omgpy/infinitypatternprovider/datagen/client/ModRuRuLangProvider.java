package com._2884omgpy.infinitypatternprovider.datagen.client;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModRuRuLangProvider extends LanguageProvider
{
    public ModRuRuLangProvider(PackOutput output)
    {
        super(output, InfinityPatternProvider.MOD_ID,"ru_ru");
    }

    @Override
    protected void addTranslations()
    {
        add(ModBlocks._1SLOTS_PATTERN_PROVIDER.get(), "МЭ 1 слот поставщик шаблонов");
        add(ModBlocks._32SLOTS_PATTERN_PROVIDER.get(), "МЭ 32 слот поставщик шаблонов");
        add(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get(), "МЭ 1024 слот поставщик шаблонов");
        add(ModBlocks.INFINITY_PATTERN_PROVIDER.get(), "МЭ бесконечность поставщик шаблонов");

        add(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get(), "МЭ 1 слот поставщик шаблонов");
        add(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get(), "МЭ 32 слот поставщик шаблонов");
        add(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get(), "МЭ 1024 слот поставщик шаблонов");
        add(ModItems.INFINITY_PATTERN_PROVIDER_PART.get(), "МЭ бесконечность поставщик шаблонов");

        add("itemGroup.infinity_pattern_provider_creative_tab", "МЭ бесконечность поставщик");

        add("gui.infinitypatternprovider._1slots_pattern_provider", "МЭ 1 слот поставщик шаблонов");
        add("gui.infinitypatternprovider._32slots_pattern_provider", "МЭ 32 слот поставщик шаблонов");
        add("gui.infinitypatternprovider._1024slots_pattern_provider", "МЭ 1024 слот поставщик шаблонов");
        add("gui.infinitypatternprovider.infinity_pattern_provider", "МЭ бесконечность поставщик шаблонов");

        add("gui.infinitypatternprovider.prev_page", "предыдущая страница");
        add("gui.infinitypatternprovider.next_page", "Следующая страница");
    }
}
