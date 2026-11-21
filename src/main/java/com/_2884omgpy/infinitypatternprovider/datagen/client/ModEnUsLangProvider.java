package com._2884omgpy.infinitypatternprovider.datagen.client;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider
{
    public ModEnUsLangProvider(PackOutput output)
    {
        super(output, InfinityPatternProvider.MOD_ID,"en_us");
    }

    @Override
    protected void addTranslations()
    {
        add(ModBlocks._1SLOTS_PATTERN_PROVIDER.get(), "1slots pattern provider");
        add(ModBlocks._32SLOTS_PATTERN_PROVIDER.get(), "32slots pattern provider");
        add(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get(), "1024slots pattern provider");
        add(ModBlocks.INFINITY_PATTERN_PROVIDER.get(), "infinity pattern provider");

        add(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get(), "1slots pattern provider");
        add(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get(), "32slots pattern provider");
        add(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get(), "1024slots pattern provider");
        add(ModItems.INFINITY_PATTERN_PROVIDER_PART.get(), "infinity pattern provider");

        add("itemGroup.infinity_pattern_provider_creative_tab", "infinity pattern provider");

        add("gui.infinitypatternprovider._1slots_pattern_provider", "1slots pattern provider");
        add("gui.infinitypatternprovider._32slots_pattern_provider", "32slots pattern provider");
        add("gui.infinitypatternprovider._1024slots_pattern_provider", "1024slots pattern provider");
        add("gui.infinitypatternprovider.infinity_pattern_provider", "infinity pattern provider");

        add("gui.infinitypatternprovider.prev_page", "prev page");
        add("gui.infinitypatternprovider.next_page", "next page");
    }
}
