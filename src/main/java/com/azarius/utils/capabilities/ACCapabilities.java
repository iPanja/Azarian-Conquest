package com.azarius.utils.capabilities;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class ACCapabilities {
	
	@CapabilityInject(IPlayerData.class)
	public static final Capability<IPlayerData> CAPABILITY_WORKER = null;
	
	public static void registerCapabilities() {
		CapabilityManager.INSTANCE.register(IPlayerData.class, new CapabilityWorker(), PlayerData.class);
	}
	
	public static class CapabilityWorker implements IStorage<IPlayerData> {
		@Override
		public NBTBase writeNBT(Capability<IPlayerData> capability, IPlayerData instance, EnumFacing side) {
			NBTTagCompound nbt = new NBTTagCompound();
			Map<String, Integer> stats = instance.getStats();
			for(Map.Entry<String, Integer> stat : stats.entrySet()) {
				nbt.setInteger(stat.getKey(), stat.getValue());
			}
			return nbt;
		}

		@Override
		public void readNBT(Capability<IPlayerData> capability, IPlayerData instance, EnumFacing side, NBTBase nbt) {
			//List<String> = new List<String>();
			NBTTagCompound compound = (NBTTagCompound) nbt;
			Map<String, Integer> stats = new HashMap<String, Integer>();
			for(String entry : compound.getKeySet()) {
				stats.put(entry, compound.getInteger(entry));
			}
			instance.setStats(stats);
		}
	}
}
