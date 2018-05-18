package com.azarius.role.professions.processing.smithing.block;

import com.azarius.AzarianConquest;
import com.azarius.client.gui.GuiHandler;
import com.azarius.init.BlockInit;
import com.azarius.init.ItemInit;
import com.azarius.role.professions.processing.smithing.tileentity.TileEntityAResearchTable;
import com.azarius.utils.Reference;
import com.azarius.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockAdvancedResearchTable extends Block implements IHasModel, ITileEntityProvider{
	public BlockAdvancedResearchTable() {
		super(Material.ROCK);
		this.setUnlocalizedName("blockaresearchtable");
		this.setRegistryName(Reference.MODID, "BlockAResearchTable");
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
		// TODO Auto-generated method stub
		return new TileEntityAResearchTable();
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
			playerIn.openGui(AzarianConquest.instance, GuiHandler.ARESEARCHTABLE, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}
	
	@Override
	public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
		if(playerIn.getHeldItemMainhand() != null) {
			
		}
		super.onBlockClicked(worldIn, pos, playerIn);
	}
}
