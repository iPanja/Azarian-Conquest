package com.azarius.client.gui;

import com.azarius.containers.ContainerAResearchTable;
import com.azarius.containers.ContainerBResearchTable;
import com.azarius.containers.ContainerBloomery;
import com.azarius.containers.ContainerIResearchTable;
import com.azarius.role.professions.processing.smithing.tileentity.TileEntityAResearchTable;
import com.azarius.role.professions.processing.smithing.tileentity.TileEntityBResearchTable;
import com.azarius.role.professions.processing.smithing.tileentity.TileEntityBloomery;
import com.azarius.role.professions.processing.smithing.tileentity.TileEntityIResearchTable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	public static final int BLOOMERY = 0;
	public static final int IRESEARCHTABLE = 1;
	public static final int ARESEARCHTABLE = 2;
	public static final int BRESEARCHTABLE = 3;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == BLOOMERY) {
			return new ContainerBloomery(player.inventory, (TileEntityBloomery) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == IRESEARCHTABLE) {
			return new ContainerIResearchTable(player.inventory, (TileEntityIResearchTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == ARESEARCHTABLE) {
			return new ContainerAResearchTable(player.inventory, (TileEntityAResearchTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == BRESEARCHTABLE) {
			return new ContainerBResearchTable(player.inventory, (TileEntityBResearchTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID==BLOOMERY) {
			return new GuiBloomery(player.inventory, (TileEntityBloomery) world.getTileEntity(new BlockPos(x, y, z)));
		} 
		if(ID==IRESEARCHTABLE) {
			return new GuiIResearchTable(player.inventory, (TileEntityIResearchTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID==ARESEARCHTABLE) {
			return new GuiAResearchTable(player.inventory, (TileEntityAResearchTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID==BRESEARCHTABLE) {
			return new GuiBResearchTable(player.inventory, (TileEntityBResearchTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
