package com.azarius.utils.data.skilltree;

import com.azarius.utils.enums.ProfessionList;

public class Leatherworking extends AProfession{
	
	//Required Methods for a Profession
	public Leatherworking() {
		super(ProfessionList.LEATHERWORKING, 2);
	}
	public ProfessionList getProfession() {
		return super.getProfession();
	}
	public int getLevel() {
		return super.getLevel();
	}
	public void addXP(int amount) {
		super.addXP(amount);
	}
	
}
