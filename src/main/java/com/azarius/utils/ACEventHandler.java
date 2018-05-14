package com.azarius.utils;

import com.azarius.utils.worlddata.WorldData;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.Console;

public class ACEventHandler {
	@SubscribeEvent
	public void  playerInteract(PlayerInteractEvent e) {
		
	}
	
	WorldData data;
	
	@SubscribeEvent
    public void RightClickBlock(PlayerInteractEvent.RightClickItem event) {
    	//Load World Configuration
		data = data.getInstance(Minecraft.getMinecraft().world);
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("Yeet", nbt.getInteger("Yeet")+1);
		data.writeToNBT(nbt);
		Console.out().println("Yeet is now at: " + nbt.getInteger("Yeet"));
    }
}
