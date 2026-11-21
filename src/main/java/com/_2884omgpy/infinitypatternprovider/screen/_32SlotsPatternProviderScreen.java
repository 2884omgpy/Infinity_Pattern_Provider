package com._2884omgpy.infinitypatternprovider.screen;

import appeng.client.gui.implementations.PatternProviderScreen;
import appeng.client.gui.style.ScreenStyle;
import appeng.menu.slot.AppEngSlot;
import com._2884omgpy.infinitypatternprovider.component.DownArrowButtonWidget;
import com._2884omgpy.infinitypatternprovider.component.UpArrowButtonWidget;
import com._2884omgpy.infinitypatternprovider.menu._32SlotsPatternProviderMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

import java.util.List;

public class _32SlotsPatternProviderScreen extends PatternProviderScreen<_32SlotsPatternProviderMenu>
{
    private List<AppEngSlot> patternSlots;

    public _32SlotsPatternProviderScreen(_32SlotsPatternProviderMenu menu, Inventory playerInventory, Component title, ScreenStyle style)
    {
        super(menu, playerInventory, title, style);
        this.patternSlots = menu.getPatternSlots();
    }

    @Override
    protected void init()
    {
        super.init();

        addButton();
        updateAllSlotPositions();
    }

    private void addButton()
    {
        UpArrowButtonWidget upArrowButton = new UpArrowButtonWidget(this.leftPos + 154, this.topPos + 41, button -> prevPage());
        DownArrowButtonWidget downArrowButton = new DownArrowButtonWidget(this.leftPos + 154, this.topPos + 91, button -> nextPage());

        addRenderableWidget(upArrowButton);
        addRenderableWidget(downArrowButton);
    }

    //更新所有槽位的位置
    private void updateAllSlotPositions()
    {
        if (patternSlots == null || patternSlots.isEmpty())
        {
            return;
        }

        for (int i = 0; i < patternSlots.size(); i++)
        {
            AppEngSlot slot = patternSlots.get(i);
            setSlotPosition(slot, i);
        }
    }

    //设置槽位位置
    private void setSlotPosition(AppEngSlot slot, int slotIndex)
    {
        //x和y变量已经在访问变换器中强制去除了final修饰符，可以正常赋值
        slot.x = 8 + (slotIndex % 32) % 8 * 18;
        slot.y = 42 + (slotIndex % 32) / 8 * 18;

        //更新槽位状态
        slot.setChanged();
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks)
    {
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
    }

    private void prevPage()
    {

    }

    private void nextPage()
    {

    }
}