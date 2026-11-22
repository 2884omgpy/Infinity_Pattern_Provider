package com._2884omgpy.infinitypatternprovider.component;

import com._2884omgpy.infinitypatternprovider.InfinityPatternProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class DownArrowButtonWidget extends Button
{
    private static final Identifier NEXT_BUTTON_HOVER = Identifier.fromNamespaceAndPath(InfinityPatternProvider.MOD_ID, "textures/gui/next_button_hover.png");

    public DownArrowButtonWidget(int x, int y, OnPress onPress)
    {
        super(x, y, 15, 22, Component.empty(), onPress, DEFAULT_NARRATION);
    }

    @Override
    public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTick)
    {
        if(isHovered())
        {
            guiGraphics.blit(RenderPipelines.GUI_TEXTURED, NEXT_BUTTON_HOVER, getX(), getY(), 0, 0, 15, 22, 15, 22);
            guiGraphics.setTooltipForNextFrame(Minecraft.getInstance().font, Component.translatable("gui.infinitypatternprovider.next_page"), mouseX, mouseY);
        }
    }
}
