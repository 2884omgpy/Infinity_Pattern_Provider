package com._2884omgpy.infinitypatternprovider;

import com._2884omgpy.infinitypatternprovider.init.*;
import net.fabricmc.api.ModInitializer;

public class InfinityPatternProvider implements ModInitializer
{
	public static final String MOD_ID = "infinitypatternprovider";

	@Override
	public void onInitialize()
    {
        ModBlocks.register();
        ModBlockEntities.register();
        BindBlockAndBlockEntity.bindAll();
        ModItems.register();
        ModMenus.register();
        ModCreativeModeTabs.register();
	}
}