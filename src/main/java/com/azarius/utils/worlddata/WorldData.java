package com.azarius.utils.worlddata;

import com.azarius.utils.Reference;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.common.util.Constants;

public class WorldData extends WorldSavedData{
	
	public static final String IDENTIFIER = Reference.MODID + "_DATA";
	
	private int WorldStarts = 0;
	
	public WorldData() {
		super(IDENTIFIER);
	}
	public WorldData(String identifier) {
		super(identifier);
	}
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		WorldStarts = nbt.getInteger("WorldStarts");
	}
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("WorldStarts", WorldStarts);
		return null;
	}
	
	public static WorldData getInstance(World world) {
		MapStorage storage = world.getMapStorage();
		WorldData instance = (WorldData) storage.getOrLoadData(WorldData.class, WorldData.IDENTIFIER);
		
		if(instance == null) {
			instance = new WorldData();
			storage.setData(instance.IDENTIFIER, instance);
		}
		return instance;
	}
}
