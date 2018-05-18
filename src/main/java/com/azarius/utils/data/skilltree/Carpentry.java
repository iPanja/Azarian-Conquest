package com.azarius.utils.data.skilltree;

import com.azarius.utils.enums.ProfessionList;

public class Carpentry extends AProfession{
	
	//Required Methods for a Profession
	public Carpentry() {
		super(ProfessionList.ALCHEMY, 2);
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
