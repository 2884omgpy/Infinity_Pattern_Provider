package com._2884omgpy.infinitypatternprovider.part;

import appeng.api.networking.GridFlags;
import appeng.api.parts.IPartItem;
import appeng.api.parts.IPartModel;
import appeng.api.stacks.AEItemKey;
import appeng.core.AppEngBase;
import appeng.helpers.patternprovider.PatternProviderLogic;
import appeng.items.parts.PartModels;
import appeng.menu.ISubMenu;
import appeng.menu.MenuOpener;
import appeng.menu.locator.MenuLocator;
import appeng.parts.PartModel;
import appeng.parts.crafting.PatternProviderPart;
import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import com._2884omgpy.infinitypatternprovider.init.ModItems;
import com._2884omgpy.infinitypatternprovider.menu._1024SlotsPatternProviderMenu;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class _1024SlotsPatternProviderPart extends PatternProviderPart
{
    public static final ResourceLocation _1024SLOTS_PATTERN_PROVIDER_BASE = ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "part/_1024slots_pattern_provider_base");
    public static final ResourceLocation AE2_INTERFACE_OFF = ResourceLocation.fromNamespaceAndPath(AppEngBase.MOD_ID, "part/interface_off");
    public static final ResourceLocation AE2_INTERFACE_ON = ResourceLocation.fromNamespaceAndPath(AppEngBase.MOD_ID, "part/interface_on");
    public static final ResourceLocation AE2_INTERFACE_HAS_CHANNEL = ResourceLocation.fromNamespaceAndPath(AppEngBase.MOD_ID, "part/interface_has_channel");

    @PartModels
    public static final PartModel MODELS_OFF = new PartModel(_1024SLOTS_PATTERN_PROVIDER_BASE, AE2_INTERFACE_OFF);
    @PartModels
    public static final PartModel MODELS_ON = new PartModel(_1024SLOTS_PATTERN_PROVIDER_BASE, AE2_INTERFACE_ON);
    @PartModels
    public static final PartModel MODELS_HAS_CHANNEL = new PartModel(_1024SLOTS_PATTERN_PROVIDER_BASE, AE2_INTERFACE_HAS_CHANNEL);

    public _1024SlotsPatternProviderPart(IPartItem<?> partItem)
    {
        super(partItem);
        this.getMainNode().setFlags(GridFlags.REQUIRE_CHANNEL); //需要使用频道
    }

    //设置样板供应器槽位数量
    protected PatternProviderLogic createLogic()
    {
        return new PatternProviderLogic(this.getMainNode(), this, 1024);
    }

    //打开菜单
    @Override
    public void openMenu(Player player, MenuLocator locator)
    {
        MenuOpener.open(_1024SlotsPatternProviderMenu.TYPE, player, locator);
    }

    //返回至主菜单
    @Override
    public void returnToMainMenu(Player player, ISubMenu subMenu)
    {
        MenuOpener.returnTo(_1024SlotsPatternProviderMenu.TYPE, player, subMenu.getLocator());
    }

    //获取返回主菜单按键图标
    @Override
    public ItemStack getMainMenuIcon()
    {
        return new ItemStack(ModItems._1024SLOTS_PATTERN_PROVIDER_PART.get());
    }

    //获取终端图标
    @Override
    public AEItemKey getTerminalIcon()
    {
        return AEItemKey.of(this.getPartItem());
    }

    //获取静态模型
    @Override
    public IPartModel getStaticModels()
    {
        return this.isPowered() ? (this.isActive() ? MODELS_HAS_CHANNEL : MODELS_ON) : MODELS_OFF;
    }
}
