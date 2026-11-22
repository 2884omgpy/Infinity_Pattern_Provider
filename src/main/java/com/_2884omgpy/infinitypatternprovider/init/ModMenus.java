package com._2884omgpy.infinitypatternprovider.init;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.menu.InfinityPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._1024SlotsPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._1SlotsPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._32SlotsPatternProviderMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModMenus
{
    static
    {
        _1SlotsPatternProviderMenu.init();
        _32SlotsPatternProviderMenu.init();
        _1024SlotsPatternProviderMenu.init();
        InfinityPatternProviderMenu.init();
    }

    public static final DeferredRegister<MenuType<?>> MENU_TYPES =  DeferredRegister.create(Registries.MENU, InfinityPatternProvider.MOD_ID);

    public static final Supplier<MenuType<_1SlotsPatternProviderMenu>> _1SLOTS_PATTERN_PROVIDER = MENU_TYPES.register("_1slots_pattern_provider", () -> _1SlotsPatternProviderMenu.TYPE);
    public static final Supplier<MenuType<_32SlotsPatternProviderMenu>> _32SLOTS_PATTERN_PROVIDER = MENU_TYPES.register("_32slots_pattern_provider", () -> _32SlotsPatternProviderMenu.TYPE);
    public static final Supplier<MenuType<_1024SlotsPatternProviderMenu>> _1024SLOTS_PATTERN_PROVIDER = MENU_TYPES.register("_1024slots_pattern_provider", () -> _1024SlotsPatternProviderMenu.TYPE);
    public static final Supplier<MenuType<InfinityPatternProviderMenu>> INFINITY_PATTERN_PROVIDER = MENU_TYPES.register("infinity_pattern_provider", () -> InfinityPatternProviderMenu.TYPE);
}