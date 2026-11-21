package com._2884omgpy.infinitypatternprovider.init;

import appeng.block.AEBaseEntityBlock;
import appeng.blockentity.AEBaseBlockEntity;
import appeng.blockentity.ClientTickingBlockEntity;
import appeng.blockentity.ServerTickingBlockEntity;
import com._2884omgpy.infinitypatternprovider.block.InfinityPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1024SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._32SlotsPatternProviderBlock;
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
        bindBlockAndEntity((_1SlotsPatternProviderBlock) ModBlocks._1SLOTS_PATTERN_PROVIDER, ModBlockEntities._1SLOTS_PATTERN_PROVIDER, _1SlotsPatternProviderBlockEntity.class);
        bindBlockAndEntity((_32SlotsPatternProviderBlock) ModBlocks._32SLOTS_PATTERN_PROVIDER, ModBlockEntities._32SLOTS_PATTERN_PROVIDER, _32SlotsPatternProviderBlockEntity.class);
        bindBlockAndEntity((_1024SlotsPatternProviderBlock) ModBlocks._1024SLOTS_PATTERN_PROVIDER, ModBlockEntities._1024SLOTS_PATTERN_PROVIDER, _1024SlotsPatternProviderBlockEntity.class);
        bindBlockAndEntity((InfinityPatternProviderBlock) ModBlocks.INFINITY_PATTERN_PROVIDER, ModBlockEntities.INFINITY_PATTERN_PROVIDER, InfinityPatternProviderBlockEntity.class);
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
