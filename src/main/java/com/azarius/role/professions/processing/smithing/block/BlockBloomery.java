package com.azarius.role.professions.processing.smithing.block;

import java.util.Random;

import com.azarius.AzarianConquest;
import com.azarius.client.gui.GuiHandler;
import com.azarius.init.BlockInit;
import com.azarius.init.ItemInit;
import com.azarius.init.tileentity.TileEntityBloomery;
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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBloomery extends Block implements ITileEntityProvider, IHasModel{
	
	
	//Bounding box for 1 block is 1f
		//if you want any other size divide pixels by 16 to get the BB.
		//Pixel VAL (1,0,1,15,10,15)
		private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(.0625f,0f,.0625f,.9375f,.625f,.9375f);
		
		private boolean isRunning;
		
		public BlockBloomery() {
			super(Material.ROCK);
			this.setUnlocalizedName("blockBloomery");
			this.setRegistryName(Reference.MODID, "BlockBloomery");
			this.setCreativeTab(CreativeTabs.MISC);
			this.setHardness(2F);
			this.setSoundType(SoundType.ANVIL);
			
			this.isRunning=false;
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
			return new TileEntityBloomery();
		}
		
		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
				EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			if(!worldIn.isRemote) {
				playerIn.openGui(AzarianConquest.instance, GuiHandler.BLOOMERY, worldIn, pos.getX(), pos.getY(), pos.getZ());
			}
			return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
		}
		
		@Override
		public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
			if(playerIn.getHeldItemMainhand() != null) {
				
			}
			super.onBlockClicked(worldIn, pos, playerIn);
		}
		
		 @SideOnly(Side.CLIENT)
		    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
		    {
		        if (this.isRunning)
		        {
		           
		            double d0 = (double)pos.getX() + 0.5D;
		            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
		            double d2 = (double)pos.getZ() + 0.5D;
		            double d4 = rand.nextDouble() * 0.6D - 0.3D;
		            
		            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D);
	                worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D);
		        }  
		    }

		 
		
		

}
