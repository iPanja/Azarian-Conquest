package com.azarius.utils.capability;

public interface ISkill {
	
	int setExp();
	int setLevel();
	int getExp();
	int getLevel();
	String getProfession();
	void canLevelUp();
	void onLevelUp();
}
