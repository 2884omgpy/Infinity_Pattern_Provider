package com._2884omgpy.infinitypatternprovider.init;

import appeng.block.AEBaseEntityBlock;
import appeng.blockentity.AEBaseBlockEntity;
import appeng.blockentity.ClientTickingBlockEntity;
import appeng.blockentity.ServerTickingBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity.InfinityPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._1024SlotsPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._1SlotsPatternProviderBlockEntity;
import com._2884omgpy.infinitypatternprovider.blockentity._32SlotsPatternProviderBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BindBlockAndBlockEntity
{
    //绑定Block和对应的BlockEntity
    public static void bindAll()
    {
        bindBlockAndEntity(ModBlocks._1SLOTS_PATTERN_PROVIDER.get(), ModBlockEntities._1SLOTS_PATTERN_PROVIDER.get(), _1SlotsPatternProviderBlockEntity.class);
        bindBlockAndEntity(ModBlocks._32SLOTS_PATTERN_PROVIDER.get(), ModBlockEntities._32SLOTS_PATTERN_PROVIDER.get(), _32SlotsPatternProviderBlockEntity.class);
        bindBlockAndEntity(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get(), ModBlockEntities._1024SLOTS_PATTERN_PROVIDER.get(), _1024SlotsPatternProviderBlockEntity.class);
        bindBlockAndEntity(ModBlocks.INFINITY_PATTERN_PROVIDER.get(), ModBlockEntities.INFINITY_PATTERN_PROVIDER.get(), InfinityPatternProviderBlockEntity.class);

        AEBaseBlockEntity.registerBlockEntityItem(ModBlockEntities._1SLOTS_PATTERN_PROVIDER.get(), ModBlocks._1SLOTS_PATTERN_PROVIDER.get().asItem());
        AEBaseBlockEntity.registerBlockEntityItem(ModBlockEntities._32SLOTS_PATTERN_PROVIDER.get(), ModBlocks._32SLOTS_PATTERN_PROVIDER.get().asItem());
        AEBaseBlockEntity.registerBlockEntityItem(ModBlockEntities._1024SLOTS_PATTERN_PROVIDER.get(), ModBlocks._1024SLOTS_PATTERN_PROVIDER.get().asItem());
        AEBaseBlockEntity.registerBlockEntityItem(ModBlockEntities.INFINITY_PATTERN_PROVIDER.get(), ModBlocks.INFINITY_PATTERN_PROVIDER.get().asItem());
    }

    private static <T extends AEBaseBlockEntity> void bindBlockAndEntity(AEBaseEntityBlock<T> block, BlockEntityType<T> blockEntityType, Class<T> blockEntityClass)
    {
        BlockEntityTicker<T> serverTicker = null;
        if (ServerTickingBlockEntity.class.isAssignableFrom(blockEntityClass))
        {
            serverTicker = (level, pos, state, entity) -> ((ServerTickingBlockEntity) entity).serverTick();
        }

        BlockEntityTicker<T> clientTicker = null;
        if (ClientTickingBlockEntity.class.isAssignableFrom(blockEntityClass))
        {
            clientTicker = (level, pos, state, entity) -> ((ClientTickingBlockEntity) entity).clientTick();
        }

        //使用AE2的setBlockEntity方法进行绑定
        block.setBlockEntity(blockEntityClass, blockEntityType, clientTicker, serverTicker);
    }
}
