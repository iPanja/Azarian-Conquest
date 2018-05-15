package com.azarius.role.professions.processing.smithing.block;

import com.azarius.AzarianConquest;
import com.azarius.init.BlockInit;
import com.azarius.init.ItemInit;
import com.azarius.utils.Reference;
import com.azarius.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBasicResearchTable extends Block implements IHasModel, ITileEntityProvider{
	public BlockBasicResearchTable() {
		super(Material.ROCK);
		this.setUnlocalizedName("blockbresearchtable");
		this.setRegistryName(Reference.MODID, "BlockBResearchTable");
		this.setCreativeTab(CreativeTabs.MISC);
		this.setHardness(2F);
		this.setSoundType(SoundType.STONE);
		
		 BlockInit.BLOCKS.add(this);
		 ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));	
	}
	
	@Override
	public void registerModels() 
	{
		AzarianConquest.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return null;
	}
}
