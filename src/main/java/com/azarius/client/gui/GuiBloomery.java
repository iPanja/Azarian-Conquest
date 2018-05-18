package com.azarius.client.gui;

import com.azarius.containers.ContainerBloomery;
import com.azarius.role.professions.processing.smithing.tileentity.TileEntityBloomery;
import com.azarius.utils.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiBloomery extends GuiContainer{
	@SuppressWarnings("unused")
	private TileEntityBloomery te;
	@SuppressWarnings("unused")
	private IInventory playerInv;
	
	int guiWidth = 175;
	int guiHeight = 207;
	
	public GuiBloomery(IInventory playerInv, TileEntityBloomery te) {
		super(new ContainerBloomery(playerInv, te));
		
		this.xSize = 176;
		this.ySize = 166;
		
		
		this.te = te;
		this.playerInv = playerInv;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		int centerX = (width/2) - guiWidth/2;
		int centerY = (height/2) - guiHeight/2;
		GlStateManager.color(1F, 1F, 1F, 1F);
		this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/container/bloomery.png"));
		this.drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeight);
	}

	
}
