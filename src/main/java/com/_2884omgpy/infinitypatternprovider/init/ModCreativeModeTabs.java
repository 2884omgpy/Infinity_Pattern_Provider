package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfinityPatternProvider.MOD_ID);

    //注册创造模式物品栏
    public static final RegistryObject<CreativeModeTab> INFINITY_PATTERN_PROVIDER_CREATIVE_TAB =
            CREATIVE_MODE_TABS.register("infinity_pattern_provider_creative_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.INFINITY_PATTERN_PROVIDER.get()))
                    .title(Component.translatable("itemGroup.infinity_pattern_provider_creative_tab"))
                    .displayItems((CreativeModeTab.ItemDisplayParameters pParameters, CreativeModeTab.Output pOutput) ->
                    {
                        pOutput.accept(ModBlocks._1SLOTS_PATTERN_PROVIDER.get());
                        pOutput.accept(ModBlocks._32SLOTS_PATTERN_PROVIDER.get());
                        pOutput.accept(ModBlocks._1024SLOTS_PATTERN_PROVIDER.get());
                        pOutput.accept(ModBlocks.INFINITY_PATTERN_PROVIDER.get());

                        pOutput.accept(ModItems._1SLOTS_PATTERN_PROVIDER_PART.get());
                        pOutput.accept(ModItems._32SLOTS_PATTERN_PROVIDER_PART.get());
                        pOutput.accept(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get());
                        pOutput.accept(ModItems.INFINITY_PATTERN_PROVIDER_PART.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
