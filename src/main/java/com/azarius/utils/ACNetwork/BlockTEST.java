package com.azarius.utils.ACNetwork;

import com.azarius.AzarianConquest;
import com.azarius.init.BlockInit;
import com.azarius.init.ItemInit;
import com.azarius.utils.Reference;
import com.azarius.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockTEST extends Block implements IHasModel{
	
	public BlockTEST() {
		super(Material.ROCK);
		this.setUnlocalizedName("blockTEST");
		this.setRegistryName(Reference.MODID, "BlockTEST");
		this.setCreativeTab(CreativeTabs.MISC);
		this.setHardness(2F);
		this.setSoundType(SoundType.LADDER);
		
		 BlockInit.BLOCKS.add(this);
		 ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));	
	}
	
	@Override
	public void registerModels() 
	{
		AzarianConquest.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
