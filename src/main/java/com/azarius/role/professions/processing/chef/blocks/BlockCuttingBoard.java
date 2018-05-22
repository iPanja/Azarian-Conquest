package com.azarius.role.professions.processing.chef.blocks;

import com.azarius.AzarianConquest;
import com.azarius.init.BlockInit;
import com.azarius.init.ItemInit;
import com.azarius.role.professions.processing.chef.tileentity.TileEntityCuttingBoard;
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
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCuttingBoard extends Block implements ITileEntityProvider, IHasModel{

	
	//Bounding box for 1 block is 1f
			//if you want any other size divide pixels by 16 to get the BB.
			//Pixel VAL (1,0,1,15,10,15)
			private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.125f,0f,0.125f,0.875f,0.0625f,0.875f);
	
	public BlockCuttingBoard() {
		super(Material.WOOD);
		this.setUnlocalizedName("cuttingboard");
		this.setRegistryName(Reference.MODID, "BlockCuttingBoard");
		this.setResistance(2f);
		this.setSoundType(SoundType.WOOD);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		
	
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
	public boolean isFullCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		// TODO Auto-generated method stub
		return BOUNDING_BOX;
	}
	
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return new TileEntityCuttingBoard();
	}

}
