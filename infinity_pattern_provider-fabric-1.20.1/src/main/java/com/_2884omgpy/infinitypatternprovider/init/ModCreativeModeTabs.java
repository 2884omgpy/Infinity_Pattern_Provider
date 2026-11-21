package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs
{
    public static final CreativeModeTab INFINITY_PATTERN_PROVIDER_TAB = FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.INFINITY_PATTERN_PROVIDER)).title(Component.translatable("itemGroup.infinity_pattern_provider_creative_tab")).displayItems((parameters, output) ->
    {
        output.accept(ModBlocks._1SLOTS_PATTERN_PROVIDER);
        output.accept(ModBlocks._32SLOTS_PATTERN_PROVIDER);
        output.accept(ModBlocks._1024SLOTS_PATTERN_PROVIDER);
        output.accept(ModBlocks.INFINITY_PATTERN_PROVIDER);

        output.accept(ModItems._1SLOTS_PATTERN_PROVIDER_PART);
        output.accept(ModItems._32SLOTS_PATTERN_PROVIDER_PART);
        output.accept(ModItems._1024SLOTS_PATTERN_PROVIDER_PART);
        output.accept(ModItems.INFINITY_PATTERN_PROVIDER_PART);
    }).build();

    public static void register()
    {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(InfinityPatternProvider.MOD_ID, "creative_tab"), INFINITY_PATTERN_PROVIDER_TAB);
    }
}