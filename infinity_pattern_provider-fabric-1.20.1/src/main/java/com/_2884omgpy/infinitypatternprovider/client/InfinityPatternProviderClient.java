package com._2884omgpy.infinitypatternprovider.client;

import com._2884omgpy.infinitypatternprovider.init.ClientPartModelRegister;
import com._2884omgpy.infinitypatternprovider.init.ClientScreenRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class InfinityPatternProviderClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        //注册屏幕
        ClientScreenRegister.registerScreens();

        //注册AE2面板模型
        ClientPartModelRegister.registerPartModels();
    }
}
