package com.azarius.api.bases;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item{
	ItemBase(String unloc, String registry){
		setUnlocalizedName(unloc);
		setRegistryName("ac", registry);
	}
	
	ItemBase(String unloc, String registry, CreativeTabs tab){
		setUnlocalizedName(unloc);
		setRegistryName("ac", registry);
		setCreativeTab(tab);
	}
}
