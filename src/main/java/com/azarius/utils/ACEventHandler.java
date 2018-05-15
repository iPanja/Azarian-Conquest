package com.azarius.utils;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ACEventHandler {
	@SubscribeEvent
    public void RightClickBlock(PlayerInteractEvent.RightClickItem event) {
		if(event.getEntity() == Minecraft.getMinecraft().player) {
			
		}
    }
	@SubscribeEvent
	public void EntityJoinWorldEvent(EntityJoinWorldEvent event) {
		if(event.getEntity() == Minecraft.getMinecraft().player) {
			
		}
	}
}
