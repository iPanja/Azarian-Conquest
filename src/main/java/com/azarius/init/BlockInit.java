package com.azarius.init;

import java.util.ArrayList;
import java.util.List;

import com.azarius.api.bases.BlockBase;
import com.azarius.utils.enums.blocks.OreList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block EZBATATHORE = new BlockBase(OreList.EZBATATH.getUnlocalizedName(), OreList.EZBATATH.getRegistryName(), Material.ROCK);
	
	
	@SubscribeEvent
	public void onBlockRegister(Register<Block> event) {
		event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
	}
}
