package com.azarius.utils.capability;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class Skill implements ISkill, INBTSerializable<NBTTagCompound>{
	
	private int exp;
	private int level;
	private String profession;
	
	private Runnable onLevelUp;

	public Skill(int exp, int level, String profession, Runnable onLevelUp) {
		this.exp = exp;
		this.level = level;
		this.profession = profession;
		this.onLevelUp = onLevelUp;
	}
	
	
	@Override
	public NBTTagCompound serializeNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("level", this.level);
		nbt.setInteger("exp", this.exp);
		nbt.setString("profession", this.profession);
		return nbt;
	}


	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		this.level = nbt.getInteger("level");
		this.exp = nbt.getInteger("exp");
		this.profession = nbt.getString("profession");	
	}


	@Override
	public int setExp() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int setLevel() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getExp() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getProfession() {
		// TODO Auto-generated method stub
		return profession;
	}


	@Override
	public void onLevelUp() {
		this.onLevelUp.run();
		
	}


	@Override
	public void canLevelUp() {
		
		
	}
	
	
}
