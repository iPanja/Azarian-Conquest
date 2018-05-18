package com.azarius.utils.enums.items;

public enum MealList {
	//PLACEHOLDER (NO TEXTURE)
	CHERRYPIE("cherryPie", "ItemCherryPie");
	
	private String unloc;
	private String registry;
	
	MealList(String unloc, String registry){
		this.unloc = unloc;
		this.registry = registry;
	}
	
	public String getUnlocalizedName() {
		return unloc;
	}
	
	public String getRegistryName() {
		return registry;
	}
	
}
