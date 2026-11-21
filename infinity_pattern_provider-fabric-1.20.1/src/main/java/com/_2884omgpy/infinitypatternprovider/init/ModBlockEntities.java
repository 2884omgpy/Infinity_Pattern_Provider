package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.blockentity.InfinityPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._1024SlotsPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._1SlotsPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._32SlotsPatternProviderBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities
{
    public static final BlockEntityType<_1SlotsPatternProviderBlockEntity> _1SLOTS_PATTERN_PROVIDER = FabricBlockEntityTypeBuilder.create(_1SlotsPatternProviderBlockEntity::new, ModBlocks._1SLOTS_PATTERN_PROVIDER).build();
    public static final BlockEntityType<_32SlotsPatternProviderBlockEntity> _32SLOTS_PATTERN_PROVIDER = FabricBlockEntityTypeBuilder.create(_32SlotsPatternProviderBlockEntity::new, ModBlocks._32SLOTS_PATTERN_PROVIDER).build();
    public static final BlockEntityType<_1024SlotsPatternProviderBlockEntity> _1024SLOTS_PATTERN_PROVIDER = FabricBlockEntityTypeBuilder.create(_1024SlotsPatternProviderBlockEntity::new, ModBlocks._1024SLOTS_PATTERN_PROVIDER).build();
    public static final BlockEntityType<InfinityPatternProviderBlockEntity> INFINITY_PATTERN_PROVIDER = FabricBlockEntityTypeBuilder.create(InfinityPatternProviderBlockEntity::new, ModBlocks.INFINITY_PATTERN_PROVIDER).build();

    public static void register()
    {
        register("_1slots_pattern_provider", _1SLOTS_PATTERN_PROVIDER);
        register("_32slots_pattern_provider", _32SLOTS_PATTERN_PROVIDER);
        register("_1024slots_pattern_provider", _1024SLOTS_PATTERN_PROVIDER);
        register("infinity_pattern_provider", INFINITY_PATTERN_PROVIDER);
    }

    private static void register(String path, BlockEntityType<?> type)
    {
        Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(InfinityPatternProvider.MOD_ID, path), type);
    }
}