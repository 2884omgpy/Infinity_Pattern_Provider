package com._2884omgpy.infinitypatternprovider.datagen.client;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModKoKrLangProvider extends LanguageProvider
{
    public ModKoKrLangProvider(PackOutput output)
    {
        super(output, InfinityPatternProvider.MOD_ID,"ko_kr");
    }

    @Override
    protected void addTranslations()
    {
        add(ModBlocks._1SLOTS_PATTERN_PROVIDER.get(), "ME1슬롯 템플릿 공급기");
        add(ModBlocks._32SLOTS_PATTERN_PROVIDER.get(), "ME32슬롯 템플릿 공급기");
        add(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get(), "ME1024슬롯 템플릿 공급기");
        add(ModBlocks.INFINITY_PATTERN_PROVIDER.get(), "ME무한 템플릿 공급기");

        add(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get(), "ME1슬롯 템플릿 공급기");
        add(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get(), "ME32슬롯 템플릿 공급기");
        add(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get(), "ME1024슬롯 템플릿 공급기");
        add(ModItems.INFINITY_PATTERN_PROVIDER_PART.get(), "ME무한 템플릿 공급기");

        add("itemGroup.infinity_pattern_provider_creative_tab", "ME무한 템플릿 공급기");

        add("gui.infinitypatternprovider._1slots_pattern_provider", "ME1슬롯 템플릿 공급기");
        add("gui.infinitypatternprovider._32slots_pattern_provider", "ME32슬롯 템플릿 공급기");
        add("gui.infinitypatternprovider._1024slots_pattern_provider", "ME1024슬롯 템플릿 공급기");
        add("gui.infinitypatternprovider.infinity_pattern_provider", "ME무한 템플릿 공급기");

        add("gui.infinitypatternprovider.prev_page", "이전 페이지");
        add("gui.infinitypatternprovider.next_page", "다음 페이지");
    }
}
