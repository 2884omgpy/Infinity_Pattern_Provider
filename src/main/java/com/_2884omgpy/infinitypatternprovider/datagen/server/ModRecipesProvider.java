package com._2884omgpy.infinitypatternprovider.datagen.server;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModBlocks;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipesProvider(PackOutput pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer)
    {
        //blockentity:
        //样板供应器 -> 9 * ME1槽位样板供应器
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AEBlocks.PATTERN_PROVIDER), RecipeCategory.BUILDING_BLOCKS, ModBlocks._1SLOTS_PATTERN_PROVIDER.get(),9)
                .unlockedBy("has_pattern_provider", has(AEBlocks.PATTERN_PROVIDER))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "1slots_pattern_provider_blockentity_from_ae2"));

        //9 * ME1槽位样板供应器 -> 样板供应器
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AEBlocks.PATTERN_PROVIDER)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks._1SLOTS_PATTERN_PROVIDER.get())
                .unlockedBy("has_1slots_pattern_provider", has(ModBlocks._1SLOTS_PATTERN_PROVIDER.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "pattern_provider_blockentity_from_1slots_pattern_provider"));

        //ME1样板供应器 + 逻辑处理器 + 1K ME存储组件 + 硅 -> ME32槽位样板供应器
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks._32SLOTS_PATTERN_PROVIDER.get())
                .pattern("AB")
                .pattern("CD")
                .define('A', ModBlocks._1SLOTS_PATTERN_PROVIDER.get())
                .define('B', AEItems.LOGIC_PROCESSOR)
                .define('C', AEItems.CELL_COMPONENT_1K)
                .define('D', AEItems.SILICON)
                .unlockedBy("has_pattern_provider", has(AEBlocks.PATTERN_PROVIDER))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "32slots_pattern_provider_blockentity_from_ae2"));

        //ME32槽位样板供应器 + 运算处理器 + 16K ME存储组件 + 物质球 -> ME1024槽位样板供应器
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks._1024SLOTS_PATTERN_PROVIDER.get())
                .pattern("AB")
                .pattern("CD")
                .define('A', ModBlocks._32SLOTS_PATTERN_PROVIDER.get())
                .define('B', AEItems.CALCULATION_PROCESSOR)
                .define('C', AEItems.CELL_COMPONENT_16K)
                .define('D', AEItems.MATTER_BALL)
                .unlockedBy("has_32slots_pattern_provider", has(ModBlocks._32SLOTS_PATTERN_PROVIDER.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "1024slots_pattern_provider_blockentity_from_ae2"));

        //ME1024槽位样板供应器 + 工程处理器 + 256K ME存储组件 + 奇点 -> ME无限槽位样板供应器
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.INFINITY_PATTERN_PROVIDER.get())
                .pattern("AB")
                .pattern("CD")
                .define('A', ModBlocks._1024SLOTS_PATTERN_PROVIDER.get())
                .define('B', AEItems.ENGINEERING_PROCESSOR)
                .define('C', AEItems.CELL_COMPONENT_256K)
                .define('D', AEItems.SINGULARITY)
                .unlockedBy("has_1024slots_pattern_provider", has(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "infinity_pattern_provider_blockentity_from_ae2"));

        //part:
        //样板供应器 -> 9 * ME1槽位样板供应器
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AEParts.PATTERN_PROVIDER), RecipeCategory.BUILDING_BLOCKS, ModItems._1SLOTS_PATTERN_PROVIDER_PART.get(),9)
                .unlockedBy("has_pattern_provider_part", has(AEParts.PATTERN_PROVIDER))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "1slots_pattern_provider_part_from_ae2"));

        //9 * ME1槽位样板供应器 -> 样板供应器
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AEParts.PATTERN_PROVIDER)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems._1SLOTS_PATTERN_PROVIDER_PART.get())
                .unlockedBy("has_1slots_pattern_provider_part", has(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "pattern_provider_part_from_1slots_pattern_provider"));

        //ME1槽位样板供应器 + 逻辑处理器 + 1K ME存储组件 + 硅 -> ME32槽位样板供应器
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems._32SLOTS_PATTERN_PROVIDER_PART.get())
                .pattern("AB")
                .pattern("CD")
                .define('A', ModItems._1SLOTS_PATTERN_PROVIDER_PART.get())
                .define('B', AEItems.LOGIC_PROCESSOR)
                .define('C', AEItems.CELL_COMPONENT_1K)
                .define('D', AEItems.SILICON)
                .unlockedBy("has_pattern_provider_part", has(AEParts.PATTERN_PROVIDER))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "32slots_pattern_provider_part_from_ae2"));

        //ME32槽位样板供应器 + 运算处理器 + 16K ME存储组件 + 物质球 -> ME1024槽位样板供应器
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get())
                .pattern("AB")
                .pattern("CD")
                .define('A', ModItems._32SLOTS_PATTERN_PROVIDER_PART.get())
                .define('B', AEItems.CALCULATION_PROCESSOR)
                .define('C', AEItems.CELL_COMPONENT_16K)
                .define('D', AEItems.MATTER_BALL)
                .unlockedBy("has_32slots_pattern_provider_part", has(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "1024slots_pattern_provider_part_from_ae2"));

        //ME1024槽位样板供应器 + 工程处理器 + 256K ME存储组件 + 奇点 -> ME无限槽位样板供应器
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.INFINITY_PATTERN_PROVIDER_PART.get())
                .pattern("AB")
                .pattern("CD")
                .define('A', ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get())
                .define('B', AEItems.ENGINEERING_PROCESSOR)
                .define('C', AEItems.CELL_COMPONENT_256K)
                .define('D', AEItems.SINGULARITY)
                .unlockedBy("has_1024slots_pattern_provider_part", has(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "infinity_pattern_provider_part_from_ae2"));

        //blockentity <-> part:
        //ME1槽位样板供应器
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks._1SLOTS_PATTERN_PROVIDER.get())
                .requires(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get())
                .unlockedBy("has_1slots_pattern_provider_part", has(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "1slots_pattern_provider_blockentity_from_part"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems._1SLOTS_PATTERN_PROVIDER_PART.get())
                .requires(ModBlocks._1SLOTS_PATTERN_PROVIDER.get())
                .unlockedBy("has_1slots_pattern_provider", has(ModBlocks._1SLOTS_PATTERN_PROVIDER.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "1slots_pattern_provider_part_from_blockentitys"));

        //ME32槽位样板供应器
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks._32SLOTS_PATTERN_PROVIDER.get())
                .requires(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get())
                .unlockedBy("has_32slots_pattern_provider_part", has(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "32slots_pattern_provider_blockentity_from_part"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems._32SLOTS_PATTERN_PROVIDER_PART.get())
                .requires(ModBlocks._32SLOTS_PATTERN_PROVIDER.get())
                .unlockedBy("has_32slots_pattern_provider", has(ModBlocks._32SLOTS_PATTERN_PROVIDER.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "32slots_pattern_provider_part_from_blockentitys"));

        //ME1024槽位样板供应器
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks._1024SLOTS_PATTERN_PROVIDER.get())
                .requires(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get())
                .unlockedBy("has_1024slots_pattern_provider_part", has(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "1024slots_pattern_provider_blockentity_from_part"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get())
                .requires(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get())
                .unlockedBy("has_1024slots_pattern_provider", has(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "1024slots_pattern_provider_part_from_blockentity"));

        //ME无限样板供应器
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.INFINITY_PATTERN_PROVIDER.get())
                .requires(ModItems.INFINITY_PATTERN_PROVIDER_PART.get())
                .unlockedBy("has_infinity_pattern_provider_part", has(ModItems.INFINITY_PATTERN_PROVIDER_PART.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "infinity_pattern_provider_blockentity_from_part"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INFINITY_PATTERN_PROVIDER_PART.get())
                .requires(ModBlocks.INFINITY_PATTERN_PROVIDER.get())
                .unlockedBy("has_infinity_pattern_provider", has(ModBlocks.INFINITY_PATTERN_PROVIDER.get()))
                .save(writer, ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "infinity_pattern_provider_part_from_blockentity"));
    }
}
