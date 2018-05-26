package com.azarius.common.core.proxy;


import com.azarius.role.professions.processing.smithing.tileentity.TileEntityBloomery;
import com.azarius.role.professions.processing.smithing.tileentity.TileEntityIResearchTable;
import com.azarius.utils.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
	
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public void registerTileEntity() {
		GameRegistry.registerTileEntity(TileEntityBloomery.class, Reference.MODID + ":blockbloomery");
		GameRegistry.registerTileEntity(TileEntityIResearchTable.class, Reference.MODID + ":blockiresearchtable");
	}
	public void init() {
		
	}
	
	public EntityPlayer getPlayerEntityFromContext(MessageContext ctx){
	        return ctx.getServerHandler().player;
	}

	
}
