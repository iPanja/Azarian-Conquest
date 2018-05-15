package com.azarius.client.gui;

import com.azarius.containers.ContainerBResearchTable;
import com.azarius.init.tileentity.TileEntityBResearchTable;
import com.azarius.utils.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiBResearchTable extends GuiContainer{
	@SuppressWarnings("unused")
	private TileEntityBResearchTable te;
	@SuppressWarnings("unused")
	private IInventory playerInv;
	
	int guiWidth = 175;
	int guiHeight = 165;
	
	public GuiBResearchTable(IInventory playerInv, TileEntityBResearchTable te) {
		super(new ContainerBResearchTable(playerInv, te));
		
		this.xSize = 175;
		this.ySize = 165;
		
		
		this.te = te;
		this.playerInv = playerInv;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		int centerX = (width/2) - guiWidth/2;
		int centerY = (height/2) - guiHeight/2;
		GlStateManager.color(1F, 1F, 1F, 1F);
		this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/container/bresearchtable.png"));
		this.drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeight);
	}

	
}
