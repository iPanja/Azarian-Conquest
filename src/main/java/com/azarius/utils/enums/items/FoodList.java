package com.azarius.utils.enums.items;
//UPDATE
public enum FoodList {
	
	AMARANTH("amaranth", "ItemAmaranth"),
	BARLEY("barley", "ItemBarley"),
	BUCKWHEAT("buckwheat", "ItemBuckwheat"),
	MILLET("millet", "ItemMillet"),
	OATS("oats", "ItemOats"),
	RICE("rice", "ItemRice"),
	RYE("rye", "ItemRye"),
	SORGHUM("sorghum", "ItemSorghum"),
	TRITICALE("triticale", "ItemTriticale");
	
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
