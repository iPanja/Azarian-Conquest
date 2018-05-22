package com.azarius.init;

import java.util.ArrayList;
import java.util.List;

import com.azarius.AzarianConquest;
import com.azarius.utils.bases.FoodBase;
import com.azarius.utils.bases.ItemBase;
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
		public static final Item amaranth = new ItemBase(FoodList.AMARANTH.getUnlocalizedName(), FoodList.AMARANTH.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item barley = new ItemBase(FoodList.BARLEY.getUnlocalizedName(), FoodList.BARLEY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item buckwheat = new ItemBase(FoodList.BUCKWHEAT.getUnlocalizedName(), FoodList.BUCKWHEAT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item millet = new ItemBase(FoodList.MILLET.getUnlocalizedName(), FoodList.MILLET.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item oats = new ItemBase(FoodList.OATS.getUnlocalizedName(), FoodList.OATS.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item rice = new ItemBase(FoodList.RICE.getUnlocalizedName(), FoodList.RICE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item rye = new ItemBase(FoodList.RYE.getUnlocalizedName(), FoodList.RYE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item sorghum = new ItemBase(FoodList.SORGHUM.getUnlocalizedName(), FoodList.SORGHUM.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item triticale = new ItemBase(FoodList.TRITICALE.getUnlocalizedName(), FoodList.TRITICALE.getRegistryName(), AzarianConquest.tabACFood);
		
		//Register Protein
		public static final Item venison = new ItemBase(FoodList.VENISON.getUnlocalizedName(), FoodList.VENISON.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item mutton = new ItemBase(FoodList.MUTTON.getUnlocalizedName(), FoodList.MUTTON.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item duck = new ItemBase(FoodList.DUCK.getUnlocalizedName(), FoodList.DUCK.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item horse = new ItemBase(FoodList.HORSE.getUnlocalizedName(), FoodList.HORSE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item squirrel = new ItemBase(FoodList.SQUIRREL.getUnlocalizedName(), FoodList.SQUIRREL.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item rabbit = new ItemBase(FoodList.RABBIT.getUnlocalizedName(), FoodList.RABBIT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item boar = new ItemBase(FoodList.BOAR.getUnlocalizedName(), FoodList.BOAR.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item buffalo = new ItemBase(FoodList.BUFFALO.getUnlocalizedName(), FoodList.BUFFALO.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item goat = new ItemBase(FoodList.GOAT.getUnlocalizedName(), FoodList.GOAT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item spam = new ItemBase(FoodList.SPAM.getUnlocalizedName(), FoodList.SPAM.getRegistryName(), AzarianConquest.tabACFood);
		//Register Fish
		public static final Item barracuda = new ItemBase(FoodList.BARRACUDA.getUnlocalizedName(), FoodList.BARRACUDA.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item shark = new ItemBase(FoodList.SHARK.getUnlocalizedName(), FoodList.SHARK.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item salmon = new ItemBase(FoodList.SALMON.getUnlocalizedName(), FoodList.SALMON.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item catfish = new ItemBase(FoodList.CATFISH.getUnlocalizedName(), FoodList.CATFISH.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item bass = new ItemBase(FoodList.BASS.getUnlocalizedName(), FoodList.BASS.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item bluegill = new ItemBase(FoodList.BLUEGILL.getUnlocalizedName(), FoodList.BLUEGILL.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item herring = new ItemBase(FoodList.HERRING.getUnlocalizedName(), FoodList.HERRING.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item trout = new ItemBase(FoodList.TROUT.getUnlocalizedName(), FoodList.TROUT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item carp = new ItemBase(FoodList.CARP.getUnlocalizedName(), FoodList.CARP.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item marlin = new ItemBase(FoodList.MARLIN.getUnlocalizedName(), FoodList.MARLIN.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item flounder = new ItemBase(FoodList.FLOUNDER.getUnlocalizedName(), FoodList.FLOUNDER.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item lobster = new ItemBase(FoodList.LOBSTER.getUnlocalizedName(), FoodList.LOBSTER.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item crab = new ItemBase(FoodList.CRAB.getUnlocalizedName(), FoodList.CRAB.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item kingcrab = new ItemBase(FoodList.KINGCRAB.getUnlocalizedName(), FoodList.KINGCRAB.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item bluecrab = new ItemBase(FoodList.BLUECRAB.getUnlocalizedName(), FoodList.BLUECRAB.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item stonecrab = new ItemBase(FoodList.STONECRAB.getUnlocalizedName(), FoodList.STONECRAB.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item spidercrab = new ItemBase(FoodList.SPIDERCRAB.getUnlocalizedName(), FoodList.SPIDERCRAB.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item dungenesscrab = new ItemBase(FoodList.DUNGENESSCRAB.getUnlocalizedName(), FoodList.DUNGENESSCRAB.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item coconutcrab = new ItemBase(FoodList.COCONUTCRAB.getUnlocalizedName(), FoodList.COCONUTCRAB.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item eel = new ItemBase(FoodList.EEL.getUnlocalizedName(), FoodList.EEL.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item anchovy = new ItemBase(FoodList.ANCHOVY.getUnlocalizedName(), FoodList.ANCHOVY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item swordfish = new ItemBase(FoodList.SWORDFISH.getUnlocalizedName(), FoodList.SWORDFISH.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item shrimp = new ItemBase(FoodList.SHRIMP.getUnlocalizedName(), FoodList.SHRIMP.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item grouper = new ItemBase(FoodList.GROUPER.getUnlocalizedName(), FoodList.GROUPER.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item jellyfish = new ItemBase(FoodList.JELLYFISH.getUnlocalizedName(), FoodList.JELLYFISH.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item mantaray = new ItemBase(FoodList.MANTARAY.getUnlocalizedName(), FoodList.MANTARAY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item stingray = new ItemBase(FoodList.STINGRAY.getUnlocalizedName(), FoodList.STINGRAY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item muscle = new ItemBase(FoodList.MUSCLE.getUnlocalizedName(), FoodList.MUSCLE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item oyster = new ItemBase(FoodList.OYSTER.getUnlocalizedName(), FoodList.OYSTER.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item clam = new ItemBase(FoodList.CLAM.getUnlocalizedName(), FoodList.CLAM.getRegistryName(), AzarianConquest.tabACFood);
		//Register Spices
		public static final Item dill = new ItemBase(FoodList.DILL.getUnlocalizedName(), FoodList.DILL.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item thyme = new ItemBase(FoodList.THYME.getUnlocalizedName(), FoodList.THYME.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item rosemary = new ItemBase(FoodList.ROSEMARY.getUnlocalizedName(), FoodList.ROSEMARY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item parsley = new ItemBase(FoodList.PARSLEY.getUnlocalizedName(), FoodList.PARSLEY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item basil = new ItemBase(FoodList.BASIL.getUnlocalizedName(), FoodList.BASIL.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item peppercorn = new ItemBase(FoodList.PEPPERCORN.getUnlocalizedName(), FoodList.PEPPERCORN.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item cinnamon = new ItemBase(FoodList.CINNAMON.getUnlocalizedName(), FoodList.CINNAMON.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item vanillabean = new ItemBase(FoodList.VANILLABEAN.getUnlocalizedName(), FoodList.VANILLABEAN.getRegistryName(), AzarianConquest.tabACFood);
		//Register Vegetables
		public static final Item broccoli = new ItemBase(FoodList.BROCCOLI.getUnlocalizedName(), FoodList.BROCCOLI.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item brusselsprout = new ItemBase(FoodList.BRUSSELSPROUT.getUnlocalizedName(), FoodList.BRUSSELSPROUT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item cabbage = new ItemBase(FoodList.CABBAGE.getUnlocalizedName(), FoodList.CABBAGE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item celery = new ItemBase(FoodList.CELERY.getUnlocalizedName(), FoodList.CELERY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item kale = new ItemBase(FoodList.KALE.getUnlocalizedName(), FoodList.KALE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item lettuce = new ItemBase(FoodList.LETTUCE.getUnlocalizedName(), FoodList.LETTUCE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item spinach = new ItemBase(FoodList.SPINACH.getUnlocalizedName(), FoodList.SPINACH.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item turnip = new ItemBase(FoodList.TURNIP.getUnlocalizedName(), FoodList.TURNIP.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item corn = new ItemBase(FoodList.CORN.getUnlocalizedName(), FoodList.CORN.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item onion = new ItemBase(FoodList.ONION.getUnlocalizedName(), FoodList.ONION.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item pickle = new ItemBase(FoodList.PICKLE.getUnlocalizedName(), FoodList.PICKLE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item jalapeno = new ItemBase(FoodList.JALAPENO.getUnlocalizedName(), FoodList.JALAPENO.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item greenbellpepper = new ItemBase(FoodList.GREENBELLPEPPER.getUnlocalizedName(), FoodList.GREENBELLPEPPER.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item redbellpepper = new ItemBase(FoodList.REDBELLPEPPER.getUnlocalizedName(), FoodList.REDBELLPEPPER.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item yellowbellpepper = new ItemBase(FoodList.YELLOWBELLPEPPER.getUnlocalizedName(), FoodList.YELLOWBELLPEPPER.getRegistryName(), AzarianConquest.tabACFood);
		//Register Fruits
		public static final Item strawberry = new ItemBase(FoodList.STRAWBERRY.getUnlocalizedName(), FoodList.STRAWBERRY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item blueberry = new ItemBase(FoodList.BLUEBERRY.getUnlocalizedName(), FoodList.BLUEBERRY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item raspberry = new ItemBase(FoodList.RASPBERRY.getUnlocalizedName(), FoodList.RASPBERRY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item blackberry = new ItemBase(FoodList.BLACKBERRY.getUnlocalizedName(), FoodList.BLACKBERRY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item cranberry = new ItemBase(FoodList.CRANBERRY.getUnlocalizedName(), FoodList.CRANBERRY.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item lemon = new ItemBase(FoodList.LEMON.getUnlocalizedName(), FoodList.LEMON.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item lime = new ItemBase(FoodList.LIME.getUnlocalizedName(), FoodList.LIME.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item orange = new ItemBase(FoodList.ORANGE.getUnlocalizedName(), FoodList.ORANGE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item apple = new ItemBase(FoodList.APPLE.getUnlocalizedName(), FoodList.APPLE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item banana = new ItemBase(FoodList.BANANA.getUnlocalizedName(), FoodList.BANANA.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item grape = new ItemBase(FoodList.GRAPE.getUnlocalizedName(), FoodList.GRAPE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item tomato = new ItemBase(FoodList.TOMATO.getUnlocalizedName(), FoodList.TOMATO.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item pineapple = new ItemBase(FoodList.PINEAPPLE.getUnlocalizedName(), FoodList.PINEAPPLE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item watermelon = new ItemBase(FoodList.WATERMELON.getUnlocalizedName(), FoodList.WATERMELON.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item cantaloupe = new ItemBase(FoodList.CANTALOUPE.getUnlocalizedName(), FoodList.CANTALOUPE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item grapefruit = new ItemBase(FoodList.GRAPEFRUIT.getUnlocalizedName(), FoodList.GRAPEFRUIT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item coconut = new ItemBase(FoodList.COCONUT.getUnlocalizedName(), FoodList.COCONUT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item honeydew = new ItemBase(FoodList.HONEYDEW.getUnlocalizedName(), FoodList.HONEYDEW.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item peach = new ItemBase(FoodList.PEACH.getUnlocalizedName(), FoodList.PEACH.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item kiwi = new ItemBase(FoodList.KIWI.getUnlocalizedName(), FoodList.KIWI.getRegistryName(), AzarianConquest.tabACFood);
		//Register Nuts
		public static final Item peanut = new ItemBase(FoodList.PEANUT.getUnlocalizedName(), FoodList.PEANUT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item peacan = new ItemBase(FoodList.PEACAN.getUnlocalizedName(), FoodList.PEACAN.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item almond = new ItemBase(FoodList.ALMOND.getUnlocalizedName(), FoodList.ALMOND.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item pistachio = new ItemBase(FoodList.PISTACHIO.getUnlocalizedName(), FoodList.PISTACHIO.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item walnut = new ItemBase(FoodList.WALNUT.getUnlocalizedName(), FoodList.WALNUT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item chestnut = new ItemBase(FoodList.CHESTNUT.getUnlocalizedName(), FoodList.CHESTNUT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item hazelnut = new ItemBase(FoodList.HAZELNUT.getUnlocalizedName(), FoodList.HAZELNUT.getRegistryName(), AzarianConquest.tabACFood);
		//Register Dairy
		public static final Item milk = new ItemBase(FoodList.MILK.getUnlocalizedName(), FoodList.MILK.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item cheese = new ItemBase(FoodList.CHEESE.getUnlocalizedName(), FoodList.CHEESE.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item yogurt = new ItemBase(FoodList.YOGURT.getUnlocalizedName(), FoodList.YOGURT.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item icecream = new ItemBase(FoodList.ICECREAM.getUnlocalizedName(), FoodList.ICECREAM.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item heavycream = new ItemBase(FoodList.HEAVYCREAM.getUnlocalizedName(), FoodList.HEAVYCREAM.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item whippedcream = new ItemBase(FoodList.WHIPPEDCREAM.getUnlocalizedName(), FoodList.WHIPPEDCREAM.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item pudding = new ItemBase(FoodList.PUDDING.getUnlocalizedName(), FoodList.PUDDING.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item butter = new ItemBase(FoodList.BUTTER.getUnlocalizedName(), FoodList.BUTTER.getRegistryName(), AzarianConquest.tabACFood);
		//Register Misc
		public static final Item bakingpowder = new ItemBase(FoodList.BAKINGPOWDER.getUnlocalizedName(), FoodList.BAKINGPOWDER.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item bakingsoda = new ItemBase(FoodList.BAKINGSODA.getUnlocalizedName(), FoodList.BAKINGSODA.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item brownsugar = new ItemBase(FoodList.BROWNSUGAR.getUnlocalizedName(), FoodList.BROWNSUGAR.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item confectionerssugar = new ItemBase(FoodList.CONFECTIONERSSUGAR.getUnlocalizedName(), FoodList.CONFECTIONERSSUGAR.getRegistryName(), AzarianConquest.tabACFood);
		public static final Item salt = new ItemBase(FoodList.SALT.getUnlocalizedName(), FoodList.SALT.getRegistryName(), AzarianConquest.tabACFood);
		
	@SubscribeEvent
	public void onItemRegister(Register<Item> event) {
		event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
	}
}
