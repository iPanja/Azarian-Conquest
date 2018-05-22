package com.azarius.utils.enums.items;
//UPDATE
public enum FoodList {
	//CEREALS 
	AMARANTH("amaranth", "ItemAmaranth"),
	BARLEY("barley", "ItemBarley"),
	BUCKWHEAT("buckwheat", "ItemBuckwheat"),
	MILLET("millet", "ItemMillet"),
	OATS("oats", "ItemOats"),
	RICE("rice", "ItemRice"),
	RYE("rye", "ItemRye"),
	SORGHUM("sorghum", "ItemSorghum"),
	TRITICALE("triticale", "ItemTriticale"),
	
	//PROTEIN
	VENISON("oats", "ItemOats"),
	MUTTON("oats", "ItemOats"),
	DUCK("oats", "ItemOats"),
	HORSE("oats", "ItemOats"),
	SQUIRREL("oats", "ItemOats"),
	RABBIT("oats", "ItemOats"),
	BOAR("oats", "ItemOats"),
	BUFFALO("oats", "ItemOats"),
	GOAT("oats", "ItemOats"),
	SPAM("oats", "ItemOats"),
	
	//SEAFOOD
	BARRACUDA("barracuda", "ItemBarracuda"),
	SHARK("shark", "ItemShark"),
	SALMON("salmon", "ItemSalmon"),
	CATFISH("oats", "ItemOats"),
	BASS("oats", "ItemOats"),
	BLUEGILL("oats", "ItemOats"),
	HERRING("oats", "ItemOats"),
	TROUT("oats", "ItemOats"),
	CARP("oats", "ItemOats"),
	MARLIN("oats", "ItemOats"),
	FLOUNDER("oats", "ItemOats"),
	LOBSTER("oats", "ItemOats"),
	CRAB("oats", "ItemOats"),
	KINGCRAB("oats", "ItemOats"),
	BLUECRAB("oats", "ItemOats"),
	SNOWCRAB("oats", "ItemOats"),
	STONECRAB("oats", "ItemOats"),
	SPIDERCRAB("oats", "ItemOats"),
	DUNGENESSCRAB("oats", "ItemOats"),
	COCONUTCRAB("oats", "ItemOats"),
	EEL("oats", "ItemOats"),
	ANCHOVY("oats", "ItemOats"),
	SWORDFISH("oats", "ItemOats"),
	SHRIMP("oats", "ItemOats"),
	GROUPER("oats", "ItemOats"),
	JELLYFISH("oats", "ItemOats"),
	MANTARAY("oats", "ItemOats"),
	STINGRAY("oats", "ItemOats"),
	MUSCLE("oats", "ItemOats"),
	OYSTER("oats", "ItemOats"),
	CLAM("oats", "ItemOats"),
	
	//SPICES
	DILL("dill", "ItemDill"),
	THYME("thyme", "ItemThyme"),
	ROSEMARY("rosemary", "ItemRosemary"),
	PARSLEY("parsley", "ItemParsley"),
	BASIL("basil", "ItemBasil"),
	PEPPERCORN("peppercorn", "ItemPeppercorn"),
	CINNAMON("cinnamon", "ItemCinnamon"),
	VANILLABEAN("vanillabean", "ItemVanillaBean"),
	
	//VEGETABLES
	BROCCOLI("broccoli", "ItemBroccoli"),
	BRUSSELSPROUT("oats", "ItemOats"),
	CABBAGE("oats", "ItemOats"),
	CELERY("oats", "ItemOats"),
	KALE("oats", "ItemOats"),
	LETTUCE("oats", "ItemOats"),
	SPINACH("oats", "ItemOats"),
	TURNIP("oats", "ItemOats"),
	CORN("oats", "ItemOats"),
	ONION("onion", "ItemOnion"),
	PICKLE("pickle", "ItemPickle"),
	JALAPENO("jalapeno", "ItemJalapeno"),
	GREENBELLPEPPER("greenbellpepper", "ItemGreenBellPepper"),
	REDBELLPEPPER("redbellpepper", "ItemRedBellPepper"),
	YELLOWBELLPEPPER("yellowbellpepper", "ItemYellowBellPepper"),
	
	//FRUIT
	STRAWBERRY("oats", "ItemOats"),
	BLUEBERRY("oats", "ItemOats"),
	RASPBERRY("oats", "ItemOats"),
	BLACKBERRY("oats", "ItemOats"),
	CRANBERRY("oats", "ItemOats"),
	LEMON("oats", "ItemOats"),
	LIME("oats", "ItemOats"),
	ORANGE("oats", "ItemOats"),
	APPLE("oats", "ItemOats"),
	BANANA("oats", "ItemOats"),
	GRAPE("oats", "ItemOats"),
	TOMATO("oats", "ItemOats"),
	PINEAPPLE("oats", "ItemOats"),
	WATERMELON("oats", "ItemOats"),
	CANTALOUPE("oats", "ItemOats"),
	GRAPEFRUIT("oats", "ItemOats"),
	COCONUT("oats", "ItemOats"),
	HONEYDEW("oats", "ItemOats"),
	PEACH("oats", "ItemOats"),
	KIWI("oats", "ItemOats"),
	//NUT
	PEANUT("oats", "ItemOats"),
	PEACAN("oats", "ItemOats"),
	ALMOND("oats", "ItemOats"),
	PISTACHIO("oats", "ItemOats"),
	WALNUT("oats", "ItemOats"),
	CHESTNUT("oats", "ItemOats"),
	HAZELNUT("oats", "ItemOats"),
	
	//DAIRY
	MILK("oats", "ItemOats"),
	CHEESE("oats", "ItemOats"),
	YOGURT("oats", "ItemOats"),
	ICECREAM("oats", "ItemOats"),
	HEAVYCREAM("oats", "ItemOats"),
	WHIPPEDCREAM("oats", "ItemOats"),
	PUDDING("oats", "ItemOats"),
	BUTTER("oats", "ItemOats"),
	
	//MISC
	BAKINGPOWDER("oats", "ItemOats"),
	BAKINGSODA("oats", "ItemOats"),
	BROWNSUGAR("oats", "ItemOats"),
	CONFECTIONERSSUGAR("oats", "ItemOats"),
	GRANULATEDSUGAR("oats", "ItemOats"),
	SALT("oats", "ItemOats");
	
	
	
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
