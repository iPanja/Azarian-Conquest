package com.azarius.utils.capabilities;

import com.azarius.utils.enums.ProfessionList;

public abstract class AProfession {
	int level;
	int xp;
	float lvl_modifier;
	
	
	
	abstract ProfessionList getProfession();
	abstract void setProfession();
	void addXp(int amount) {
		xp = xp + amount;
	}
}
