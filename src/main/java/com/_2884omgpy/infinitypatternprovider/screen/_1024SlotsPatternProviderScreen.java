package com._2884omgpy.infinitypatternprovider.screen;

import appeng.client.gui.implementations.PatternProviderScreen;
import appeng.client.gui.style.ScreenStyle;
import appeng.menu.slot.AppEngSlot;
import com._2884omgpy.infinitypatternprovider.component.DownArrowButtonWidget;
import com._2884omgpy.infinitypatternprovider.component.UpArrowButtonWidget;
import com._2884omgpy.infinitypatternprovider.menu._1024SlotsPatternProviderMenu;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

import java.util.List;

public class _1024SlotsPatternProviderScreen extends PatternProviderScreen<_1024SlotsPatternProviderMenu>
{
    private static final int SLOTS_PER_PAGE = 32;
    private static final int TOTAL_PAGE = 32;
    private int page = 0;
    private List<AppEngSlot> patternSlots;

    public _1024SlotsPatternProviderScreen(_1024SlotsPatternProviderMenu menu, Inventory playerInventory, Component title, ScreenStyle style)
    {
        super(menu, playerInventory, title, style);
        this.patternSlots = menu.getPatternSlots();

        for(int i = SLOTS_PER_PAGE ; i < SLOTS_PER_PAGE * TOTAL_PAGE ; i++)
        {
            AppEngSlot slot = patternSlots.get(i);
            slot.setActive(false);
        }
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

    private void setSlotPosition(AppEngSlot slot, int slotIndex)
    {
        slot.x = 8 + (slotIndex % 32) % 8 * 18;
        slot.y = 42 + (slotIndex % 32) / 8 * 18;
        slot.setChanged();
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double scrollX, double scrollY)
    {
        if (mouseX >= leftPos && mouseX < leftPos + width && mouseY >= topPos && mouseY < topPos + height)
        {
            if (scrollY > 0)
            {
                prevPage();
            }
            else
                if (scrollY < 0)
                {
                    nextPage();
                }
            return true;
        }
        return super.mouseScrolled(mouseX, mouseY, scrollX, scrollY);
    }

    public void prevPage()
    {
        PageSlotsUnVisible(page);
        if (page > 0)
        {
            page--;
        }
            else
            {
                page = TOTAL_PAGE - 1;
            }
        PageSlotsVisible(page);
    }

    public void nextPage()
    {
        PageSlotsUnVisible(page);
        if (page < TOTAL_PAGE - 1)
        {
            page++;
        }
            else
            {
                page = 0;
            }
        PageSlotsVisible(page);
    }

    private void PageSlotsVisible(int page)
    {
        for(int i = SLOTS_PER_PAGE * page ; i < SLOTS_PER_PAGE * page + SLOTS_PER_PAGE ; i++)
        {
            AppEngSlot slot = patternSlots.get(i);
            slot.setActive(true);
        }
    }

    private void PageSlotsUnVisible(int page)
    {
        for(int i = SLOTS_PER_PAGE * page ; i < SLOTS_PER_PAGE * page + SLOTS_PER_PAGE ; i++)
        {
            AppEngSlot slot = patternSlots.get(i);
            slot.setActive(false);
        }
    }

    @Override
    public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks)
    {
        super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);

        String pageString = (page + 1) + "/" + TOTAL_PAGE;
        guiGraphics.text(this.font, pageString, leftPos + 170 - this.font.width(pageString), topPos + 28, 0xFF404040, false);
    }
}