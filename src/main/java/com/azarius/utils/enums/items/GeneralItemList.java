package com.azarius.utils.enums.items;

public enum GeneralItemList {
	
	GLAZEDDONUT("glazedDonut", "ItemGlazedDonut");
	
	private String unlocalizedName;
	private String registryName;
	
	GeneralItemList(String unlocalizedName, String registryName){
	this.unlocalizedName = unlocalizedName;
	this.registryName = registryName;
		
	}
	
	public String getRegistryName() {
		return registryName;
	}
	
	public String getUnlocalizedName() {
		return unlocalizedName;
	
	}
}
