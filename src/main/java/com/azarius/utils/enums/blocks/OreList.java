package com.azarius.utils.enums.blocks;

public enum OreList {
	
	NYVIR("nyvir", "OreNyvir"),
	AYN("ayn", "OreAyn"),
	KYIANITE("kyianite", "OreKyianite"),
	SIERITE("sierite", "OreSierite"),
	CRIMSITE("crimsite", "OreCrimsite"),
	AZARITE("azarite", "OreAzarite"),
	COBAN("coban", "OreCoban"),
	LITERIAN("literian", "OreLiterian"),
	SYLVANITE("sylvanite", "OreSylvanite"),
	JYRITE("jyrite", "OreJyrite"),
	REXIAN("rexian", "OreRexian"),
	FALVERITE("falverite", "OreFalverite"),
	UIRIAN("uirian", "OreUirian"),
	DEIRITE("deirite", "OreDeirite"),
	ZIX("zix", "OreZix"),
	EZBATATH("ezbatath", "OreEzbatath");
	
	private String unloc;
	private String registry;
	
	OreList(String unloc, String registry){
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
