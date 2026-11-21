package com._2884omgpy.infinitypatternprovider.datagen.client;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider
{
    public ModZhCnLangProvider(PackOutput output)
    {
        super(output, InfinityPatternProvider.MOD_ID,"zh_cn");
    }

    @Override
    protected void addTranslations()
    {
        add(ModBlocks._1SLOTS_PATTERN_PROVIDER.get(), "ME1槽位样板供应器");
        add(ModBlocks._32SLOTS_PATTERN_PROVIDER.get(), "ME32槽位样板供应器");
        add(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get(), "ME1024槽位样板供应器");
        add(ModBlocks.INFINITY_PATTERN_PROVIDER.get(), "ME无限样板供应器");

        add(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get(), "ME1槽位样板供应器");
        add(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get(), "ME32槽位样板供应器");
        add(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get(), "ME1024槽位样板供应器");
        add(ModItems.INFINITY_PATTERN_PROVIDER_PART.get(), "ME无限样板供应器");

        add("itemGroup.infinity_pattern_provider_creative_tab", "ME无限样板供应器");

        add("gui.infinitypatternprovider._1slots_pattern_provider", "ME1槽位样板供应器");
        add("gui.infinitypatternprovider._32slots_pattern_provider", "ME32槽位样板供应器");
        add("gui.infinitypatternprovider._1024slots_pattern_provider", "ME1024槽位样板供应器");
        add("gui.infinitypatternprovider.infinity_pattern_provider", "ME无限样板供应器");

        add("gui.infinitypatternprovider.prev_page", "上一页");
        add("gui.infinitypatternprovider.next_page", "下一页");
    }
}
