package com._2884omgpy.infinitypatternprovider.init;

import appeng.core.AppEng;
import com._2884omgpy.infinitypatternprovider.menu.InfinityPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._1024SlotsPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._1SlotsPatternProviderMenu;
import com._2884omgpy.infinitypatternprovider.menu._32SlotsPatternProviderMenu;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class ClientMenuRegister
{
    public static void init()
    {
        FMLJavaModLoadingContext.get().getModEventBus().register(ClientMenuRegister.class);
    }

    //注册菜单
    @SubscribeEvent
    public static void registerMenu(RegisterEvent event)
    {
        if (event.getRegistryKey().equals(ForgeRegistries.MENU_TYPES.getRegistryKey()))
        {
            //初始化菜单类型
            _1SlotsPatternProviderMenu.init();
            _32SlotsPatternProviderMenu.init();
            _1024SlotsPatternProviderMenu.init();
            InfinityPatternProviderMenu.init();

            //注册菜单
            event.register(ForgeRegistries.MENU_TYPES.getRegistryKey(), helper -> helper.register(AppEng.makeId("_1slots_pattern_provider"), _1SlotsPatternProviderMenu.TYPE));
            event.register(ForgeRegistries.MENU_TYPES.getRegistryKey(), helper -> helper.register(AppEng.makeId("_32slots_pattern_provider"), _32SlotsPatternProviderMenu.TYPE));
            event.register(ForgeRegistries.MENU_TYPES.getRegistryKey(), helper -> helper.register(AppEng.makeId("_1024slots_pattern_provider"), _1024SlotsPatternProviderMenu.TYPE));
            event.register(ForgeRegistries.MENU_TYPES.getRegistryKey(), helper -> helper.register(AppEng.makeId("infinity_pattern_provider"), InfinityPatternProviderMenu.TYPE));
        }
    }
}
