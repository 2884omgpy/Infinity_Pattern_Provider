package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.blockentity.InfinityPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._1024SlotsPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._1SlotsPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._32SlotsPatternProviderBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities
{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, InfinityPatternProvider.MOD_ID);

    public static final RegistryObject<BlockEntityType<_1SlotsPatternProviderBlockEntity>> _1SLOTS_PATTERN_PROVIDER = BLOCK_ENTITIES.register("1slots_pattern_provider", () -> BlockEntityType.Builder.of(_1SlotsPatternProviderBlockEntity::new, ModBlocks._1SLOTS_PATTERN_PROVIDER.get()).build(null));
    public static final RegistryObject<BlockEntityType<_32SlotsPatternProviderBlockEntity>> _32SLOTS_PATTERN_PROVIDER = BLOCK_ENTITIES.register("32slots_pattern_provider", () -> BlockEntityType.Builder.of(_32SlotsPatternProviderBlockEntity::new, ModBlocks._32SLOTS_PATTERN_PROVIDER.get()).build(null));
    public static final RegistryObject<BlockEntityType<_1024SlotsPatternProviderBlockEntity>> _1024SLOTS_PATTERN_PROVIDER = BLOCK_ENTITIES.register("1024slots_pattern_provider", () -> BlockEntityType.Builder.of(_1024SlotsPatternProviderBlockEntity::new, ModBlocks._1024SLOTS_PATTERN_PROVIDER.get()).build(null));
    public static final RegistryObject<BlockEntityType<InfinityPatternProviderBlockEntity>> INFINITY_PATTERN_PROVIDER = BLOCK_ENTITIES.register("infinity_pattern_provider", () -> BlockEntityType.Builder.of(InfinityPatternProviderBlockEntity::new, ModBlocks.INFINITY_PATTERN_PROVIDER.get()).build(null));

    public static void register(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}
