package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.block.InfinityPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1024SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._1SlotsPatternProviderBlock;
import com._2884omgpy.infinitypatternprovider.block._32SlotsPatternProviderBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, InfinityPatternProvider.MOD_ID);

    public static final RegistryObject<Block> _1SLOTS_PATTERN_PROVIDER = registerBlock("_1slots_pattern_provider", () -> new _1SlotsPatternProviderBlock());        //硬度2.2，抗爆系数11.0
    public static final RegistryObject<Block> _32SLOTS_PATTERN_PROVIDER = registerBlock("_32slots_pattern_provider", () -> new _32SlotsPatternProviderBlock());
    public static final RegistryObject<Block> _1024SLOTS_PATTERN_PROVIDER = registerBlock("_1024slots_pattern_provider", () -> new _1024SlotsPatternProviderBlock());
    public static final RegistryObject<Block> INFINITY_PATTERN_PROVIDER = registerBlock("infinity_pattern_provider", () -> new InfinityPatternProviderBlock());

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> blocks = BLOCKS.register(name, block);
        return blocks;
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
