package com.azarius.client.gui;


import com.azarius.containers.ContainerAResearchTable;
import com.azarius.init.tileentity.TileEntityAResearchTable;
import com.azarius.utils.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiAResearchTable extends GuiContainer{
	@SuppressWarnings("unused")
	private TileEntityAResearchTable te;
	@SuppressWarnings("unused")
	private IInventory playerInv;
	
	int guiWidth = 175;
	int guiHeight = 165;
	
	public GuiAResearchTable(IInventory playerInv, TileEntityAResearchTable te) {
		super(new ContainerAResearchTable(playerInv, te));
		
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
		this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/container/aresearchtable.png"));
		this.drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeight);
	}

	
}
