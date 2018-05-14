package com.azarius.proxy;


import com.azarius.init.tileentity.TileEntityBloomery;
import com.azarius.utils.Reference;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
	
	public void registerTileEntity() {
		GameRegistry.registerTileEntity(TileEntityBloomery.class, Reference.MODID + ":blockbloomery");
	}
	public void init() {
		
	}
	
}
