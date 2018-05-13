package com.azarius.api.bases;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood{

	public FoodBase(String unloc, String registry, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(unloc);
		setRegistryName(registry);
		// TODO Auto-generated constructor stub
	}
	
	public FoodBase(String unloc, String registry, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName(unloc);
		setRegistryName(registry);
		
		// TODO Auto-generated constructor stub
	}

	
	

	
}
