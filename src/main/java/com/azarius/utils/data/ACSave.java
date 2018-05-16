package com.azarius.utils.data;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import scala.Console;

public class ACSave extends WorldSavedData{
	private static final String IDENTIFIER = "AzarianConquest_DATA";
	
	//Variables
	private NBTTagCompound data = new NBTTagCompound();
	
	public ACSave(String identifier) {
		super(identifier);
	}
	
	public ACSave() {
		super(IDENTIFIER);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		data = nbt;
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt = data;
		return nbt;
	}
	
	public static ACSave get(World world) {
		ACSave save = (ACSave) world.getMapStorage().getOrLoadData(ACSave.class, IDENTIFIER);
		if(save == null) {
			Console.out().println("Creating a new World Configuration File");
			save = new ACSave();
			world.getMapStorage().setData(IDENTIFIER, save);
		}else {
			Console.out().println("Using a pre-existing Configuration File!");
		}
		return save;
	}
}
