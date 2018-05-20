package com.azarius.utils;

import java.awt.Event;

import com.azarius.init.ItemInit;
import com.azarius.utils.data.ACSave;
import com.azarius.utils.experimental.IEXSkill;
import com.azarius.utils.experimental.TestCapabilities;

import net.minecraft.entity.ai.EntityMoveHelper.Action;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import scala.Console;

public class ACEventHandler {
	
	//Variables
	ACSave save;
	NBTTagCompound nbt = new NBTTagCompound();
	
	@SubscribeEvent
	public void ServerConnectionFromClientEvent	(FMLNetworkEvent.ServerConnectionFromClientEvent event) {
		Console.out().println("Event Ran");
		save = ACSave.get(FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(0));
		nbt = save.writeToNBT(nbt);
		
		//Test
		nbt.setInteger("Yeets", nbt.getInteger("Yeets")+1);
		save.readFromNBT(nbt);
		save.markDirty();
	}
	
	
	@SubscribeEvent
	public void onTouchShowUpdate(PlayerInteractEvent.LeftClickBlock e) {
		
		if (e.getItemStack() == null) return;
		if (e.getItemStack().getItem() != ItemInit.glazedDonut) return;
		
		TileEntity te = e.getWorld().getTileEntity(e.getPos());
		if (te != null && te.hasCapability(TestCapabilities.CAPABILITY_SKILL, e.getFace())) {
			e.setCanceled(true);
			IEXSkill inv = te.getCapability(TestCapabilities.CAPABILITY_SKILL, e.getFace());
			System.out.println(inv.getWorkDone());
		}
			
	}
}
