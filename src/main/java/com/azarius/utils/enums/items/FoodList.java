package com.azarius.utils.enums.items;
//UPDATE
public enum FoodList {
	
	AMARANTH("amaranth", "ItemAmaranth");
	
	private String unloc;
	private String registry;
	
	FoodList(String unloc, String registry){
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
