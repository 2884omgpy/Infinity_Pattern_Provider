package com._2884omgpy.infinitypatternprovider.component;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class DownArrowButtonWidget extends Button
{
    private static final ResourceLocation NEXT_BUTTON_HOVER = new ResourceLocation(InfinityPatternProvider.MOD_ID, "textures/gui/next_button_hover.png");

    public DownArrowButtonWidget(int x, int y, OnPress onPress)
    {
        super(x, y, 15, 22, Component.empty(), onPress, DEFAULT_NARRATION);
    }

    @Override
    public void renderWidget(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick)
    {
        if(isHovered())
        {
            guiGraphics.blit(NEXT_BUTTON_HOVER, getX(), getY(), 0, 0, 15, 22, 15, 22);
            guiGraphics.renderTooltip(Minecraft.getInstance().font, Component.translatable("gui.infinitypatternprovider.next_page"), mouseX, mouseY);
        }
    }
}
