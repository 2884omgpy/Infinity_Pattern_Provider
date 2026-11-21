package com._2884omgpy.infinitypatternprovider;

import com._2884omgpy.infinitypatternprovider.init.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(InfinityPatternProvider.MOD_ID)
public class InfinityPatternProvider
{
    public static final String MOD_ID = "infinitypatternprovider";

    public InfinityPatternProvider(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModBlocks.register(modEventBus);            //方块注册
        ModItems.register(modEventBus);             //物品注册
        ModBlockEntities.register(modEventBus);     //方块实体注册
        ModCreativeModeTabs.register(modEventBus);  //创造模式物品栏注册

        ClientPartModelRegister.init();             //注册客户端面板组件模型
        ClientMenuRegister.init();                  //注册客户端菜单

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> ModMenus.register());   //注册菜单
        BindBlockAndBlockEntity.bindAll();              //绑定方块和方块实体
    }
}
