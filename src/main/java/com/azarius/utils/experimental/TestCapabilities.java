package com.azarius.utils.experimental;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class TestCapabilities {
// DO NOT UNDER ANY CIRCUMSTANCE USE ANYTHING FROM THIS FILE EVER
// THIS IS PURELY A PLAYGROUND TO LEARN THE LOGISTICS OF THE CAPABILITY SYSTEM
	@CapabilityInject(IEXSkill.class)
	public static Capability<IEXSkill> CAPABILITY_SKILL = null;
	
	public static void registerCapabilities() {
		System.out.println("CAPABILITIES REGISTERED!");
		CapabilityManager.INSTANCE.register(IEXSkill.class, new CapabilityEXSkill(), EXSkill.class);
	}
	
	public static class CapabilityEXSkill implements IStorage<IEXSkill> {

		@Override
		public NBTBase writeNBT(Capability<IEXSkill> capability, IEXSkill instance, EnumFacing side) {
			return null;
		}

		@Override
		public void readNBT(Capability<IEXSkill> capability, IEXSkill instance, EnumFacing side, NBTBase nbt) {
		}

	}
	
	
	

}
