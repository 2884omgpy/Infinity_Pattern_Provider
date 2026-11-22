package com._2884omgpy.infinitypatternprovider.component;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class UpArrowButtonWidget extends Button
{
    private static final ResourceLocation PREV_BUTTON_HOVER = ResourceLocation.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "textures/gui/prev_button_hover.png");

    public UpArrowButtonWidget(int x, int y, OnPress onPress)
    {
        super(x, y, 15, 22, Component.empty(), onPress, DEFAULT_NARRATION);
    }

    @Override
    public void renderWidget(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick)
    {
        if(isHovered())
        {
            guiGraphics.blit(PREV_BUTTON_HOVER, getX(), getY(), 0, 0, 15, 22, 15, 22);
            guiGraphics.renderTooltip(Minecraft.getInstance().font, Component.translatable("gui.infinitypatternprovider.prev_page"), mouseX, mouseY);

        }
    }
}
