package com.azarius.utils.bases;

import com.azarius.AzarianConquest;
import com.azarius.init.ItemInit;
import com.azarius.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String unloc, String registry){
			setUnlocalizedName(unloc);
			setRegistryName("ac", registry);
			
			ItemInit.ITEMS.add(this);
	}
	
	public ItemBase(String unloc, String registry, CreativeTabs tab){
			setUnlocalizedName(unloc);
			setRegistryName("ac", registry);
			setCreativeTab(tab);
			
			ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		AzarianConquest.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	
}
