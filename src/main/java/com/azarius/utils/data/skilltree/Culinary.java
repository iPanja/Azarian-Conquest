package com.azarius.utils.data.skilltree;

import com.azarius.utils.enums.ProfessionList;

public class Culinary extends AProfession{
	
	//Required Methods for a Profession
	public Culinary() {
		super(ProfessionList.CULINARY, 2);
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
