package com.azarius.utils.data.skilltree;

import com.azarius.utils.enums.ProfessionList;

public abstract class AProfession {
	protected ProfessionList profession;
	protected int level;
	protected int xp;
	protected float lvl_modifier = 0;
	
	
	public AProfession(ProfessionList p, float lm) {
		this.profession = p;
		this.lvl_modifier = lm;
	}
	
	ProfessionList getProfession() {
		return profession;
	}
	int getLevel() {
		return level;
	}
	void addXP(int amount) {
		xp = xp + amount;
		updateLevel();
	}
	void updateLevel() {
		level = (int) (xp % (Math.pow(level, lvl_modifier)));
	}
}
