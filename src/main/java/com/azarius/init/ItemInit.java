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
		public static final Item barley = new ItemBase(FoodList.BARLEY.getUnlocalizedName(), FoodList.BARLEY.getRegistryName());
		public static final Item buckwheat = new ItemBase(FoodList.BUCKWHEAT.getUnlocalizedName(), FoodList.BUCKWHEAT.getRegistryName());
		public static final Item millet = new ItemBase(FoodList.MILLET.getUnlocalizedName(), FoodList.MILLET.getRegistryName());
		public static final Item oats = new ItemBase(FoodList.OATS.getUnlocalizedName(), FoodList.OATS.getRegistryName());
		public static final Item rice = new ItemBase(FoodList.RICE.getUnlocalizedName(), FoodList.RICE.getRegistryName());
		public static final Item rye = new ItemBase(FoodList.RYE.getUnlocalizedName(), FoodList.RYE.getRegistryName());
		public static final Item Sorghum = new ItemBase(FoodList.SORGHUM.getUnlocalizedName(), FoodList.SORGHUM.getRegistryName());
		public static final Item Triticale = new ItemBase(FoodList.TRITICALE.getUnlocalizedName(), FoodList.TRITICALE.getRegistryName());
		
	@SubscribeEvent
	public void onItemRegister(Register<Item> event) {
		event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
	}
}
