package com.azarius.utils;

import com.azarius.utils.data.ACSave;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import scala.Console;
import scala.collection.concurrent.Debug;

public class ACEventHandler {
	
	//Variables
	ACSave save;
	NBTTagCompound nbt = new NBTTagCompound();
	
	/*
	@SubscribeEvent
    public void RightClickBlock(PlayerInteractEvent.RightClickItem event) {
		if(event.getEntity() == Minecraft.getMinecraft().player && event.getWorld().isRemote) {
			Console.out().println("Is server: " + event.getWorld().isRemote);
			nbt.setInteger("Yeets", nbt.getInteger("Yeets") + 1);
			save.readFromNBT(nbt);
			save.markDirty();
			//Minecraft.getMinecraft().world.getMapStorage().saveAllData();
			EntityPlayerSP player = (EntityPlayerSP) event.getEntityPlayer();
			player.sendChatMessage("Yeet Count: " + nbt.getInteger("Yeets"));
		}
    }
    */
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
}
