package com.azarius.init;

import java.util.ArrayList;
import java.util.List;

import com.azarius.role.professions.processing.smithing.block.BlockAdvancedResearchTable;
import com.azarius.role.professions.processing.smithing.block.BlockBasicResearchTable;
import com.azarius.role.professions.processing.smithing.block.BlockBloomery;
import com.azarius.role.professions.processing.smithing.block.BlockIntermediateResearchTable;
import com.azarius.utils.bases.BlockBase;
import com.azarius.utils.enums.blocks.OreList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block AYN = new BlockBase(OreList.AYN.getUnlocalizedName(), OreList.AYN.getRegistryName(), Material.ROCK);
	public static final Block EZBATATHORE = new BlockBase(OreList.EZBATATH.getUnlocalizedName(), OreList.EZBATATH.getRegistryName(), Material.ROCK);
	public static final Block BLOOMERY = new BlockBloomery();
	public static final Block IRESEARCHTABLE = new BlockIntermediateResearchTable();
	public static final Block ARESEARCHTABLE = new BlockAdvancedResearchTable();
	public static final Block BRESEARCHTABLE = new BlockBasicResearchTable();
	
	@SubscribeEvent
	public void onBlockRegister(Register<Block> event) {
		event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
	}
}
