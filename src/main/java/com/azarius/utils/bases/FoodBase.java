package com.azarius.utils.bases;

import com.azarius.AzarianConquest;
import com.azarius.init.ItemInit;
import com.azarius.utils.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{

	public FoodBase(String unloc, String registry, int amount, float saturation, boolean isWolfFood, CreativeTabs tab) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(unloc);
		setRegistryName(registry);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}
	
	public FoodBase(String unloc, String registry, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName(unloc);
		setRegistryName(registry);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		AzarianConquest.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	

	
}
