package com.azarius.utils;

import com.azarius.utils.data.ACSave;

import net.minecraft.nbt.NBTTagCompound;
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
}
