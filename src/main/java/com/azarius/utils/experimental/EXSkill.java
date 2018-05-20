package com.azarius.utils.experimental;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class EXSkill implements IEXSkill, INBTSerializable<NBTTagCompound>{

	private Runnable doWork;
	private int cooldown;
	
	
	public EXSkill(Runnable doWork) {
		this.doWork = doWork;
	}
	
	@Override
	public NBTTagCompound serializeNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("cooldown", this.cooldown);
		return nbt;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		this.cooldown = nbt.getInteger("cooldown");

	}

	@Override
	public void doWork() {
		this.cooldown++;
		this.cooldown %= 1000000;
		if (this.cooldown == 1000000) {
			System.out.println("1000000 Ticks Reached!");
		}
		
	}

	@Override
	public int getWorkDone() {
		return this.cooldown;
	}

}
