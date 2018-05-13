package com.azarius.init;

import java.util.ArrayList;
import java.util.List;

import com.azarius.AzarianConquest;
import com.azarius.api.bases.FoodBase;
import com.azarius.api.bases.ItemBase;
import com.azarius.utils.enums.items.FoodList;
import com.azarius.utils.enums.items.GeneralItemList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemInit {
public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ItemFood glazedDonut = new FoodBase(GeneralItemList.GLAZEDDONUT.getUnlocalizedName(), GeneralItemList.GLAZEDDONUT.getRegistryName(), 2, 0.3F, false, AzarianConquest.tabACFood);
	//Register Foods
		//Register Cereals
		public static final Item amaranth = new ItemBase(FoodList.AMARANTH.getUnlocalizedName(), FoodList.AMARANTH.getRegistryName());
	
	@SubscribeEvent
	public void onItemRegister(Register<Item> event) {
		event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
	}
}
