package com.azarius.client.gui;

import com.azarius.containers.ContainerIResearchTable;
import com.azarius.init.tileentity.TileEntityIResearchTable;
import com.azarius.utils.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiIResearchTable extends GuiContainer{
	@SuppressWarnings("unused")
	private TileEntityIResearchTable te;
	@SuppressWarnings("unused")
	private IInventory playerInv;
	
	int guiWidth = 175;
	int guiHeight = 165;
	
	public GuiIResearchTable(IInventory playerInv, TileEntityIResearchTable te) {
		super(new ContainerIResearchTable(playerInv, te));
		
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
		this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/container/iresearchtable.png"));
		this.drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeight);
	}

	
}
