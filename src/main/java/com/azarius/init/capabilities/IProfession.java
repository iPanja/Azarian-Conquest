package com.azarius.init.capabilities;

public interface IProfession {
	
	
	//EXP GETTERS
	int getXP(String tag);
	
	//EXP SETTER

	void setXP(int exp, String tag);

	int getProfessionLevel(String tag, int exp);
}
