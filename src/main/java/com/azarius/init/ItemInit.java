package com.azarius.init;

import java.util.ArrayList;
import java.util.List;

import com.azarius.api.bases.ItemBase;
import com.azarius.utils.enums.items.GeneralItemList;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemInit {
public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item glazedDonut = new ItemBase(GeneralItemList.GLAZEDDONUT.getUnlocalizedName(), GeneralItemList.GLAZEDDONUT.getRegistryName());

	@SubscribeEvent
	public void onItemRegister(Register<Item> event) {
		event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
	}
}
