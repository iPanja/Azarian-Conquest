package com.azarius.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	@SubscribeEvent
	public void onBlockRegister(Register<Block> event) {
		event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
	}
}
