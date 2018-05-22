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
	VENISON("venison", "ItemVenison"),
	MUTTON("mutton", "ItemMutton"),
	DUCK("duck", "ItemDuck"),
	HORSE("horse", "ItemHorse"),
	SQUIRREL("squirrel", "ItemSquirrel"),
	RABBIT("rabbit", "ItemRabbit"),
	BOAR("boar", "ItemBoar"),
	BUFFALO("buffalo", "ItemBuffalo"),
	GOAT("goat", "ItemGoat"),
	SPAM("spam", "ItemSpam"),
	
	//SEAFOOD
	BARRACUDA("barracuda", "ItemBarracuda"),
	SHARK("shark", "ItemShark"),
	SALMON("salmon", "ItemSalmon"),
	CATFISH("catfish", "ItemCatfish"),
	BASS("bass", "ItemBass"),
	BLUEGILL("bluegill", "ItemBlueGill"),
	HERRING("herring", "ItemHerring"),
	TROUT("trout", "ItemTrout"),
	CARP("carp", "ItemCarp"),
	MARLIN("marlin", "ItemMarlin"),
	FLOUNDER("flounder", "ItemFlounder"),
	LOBSTER("lobster", "ItemLobster"),
	CRAB("crab", "ItemCrab"),
	KINGCRAB("kingcrab", "ItemKingCrab"),
	BLUECRAB("bluecrab", "ItemBlueCrab"),
	SNOWCRAB("snowcrab", "ItemSnowCrab"),
	STONECRAB("stonecrab", "ItemStoneCrab"),
	SPIDERCRAB("spidercrab", "ItemSpiderCrab"),
	DUNGENESSCRAB("dungesnesscrab", "ItemDungenessCrab"),
	COCONUTCRAB("coconutcrab", "ItemCoconutCrab"),
	EEL("eel", "ItemEel"),
	ANCHOVY("anchovy", "ItemAnchovy"),
	SWORDFISH("swordfish", "ItemSwordfish"),
	SHRIMP("shrimp", "ItemShrimp"),
	GROUPER("grouper", "ItemGrouper"),
	JELLYFISH("jellyfish", "ItemJellyfish"),
	MANTARAY("mantaray", "ItemMantaray"),
	STINGRAY("stingray", "ItemStingray"),
	MUSCLE("muscle", "ItemMuscle"),
	OYSTER("oyster", "ItemOyster"),
	CLAM("clam", "ItemClam"),
	
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
	BRUSSELSPROUT("brusselsprout", "ItemBrusselSprout"),
	CABBAGE("cabbage", "ItemCabbage"),
	CELERY("celery", "ItemCelery"),
	KALE("kale", "ItemKale"),
	LETTUCE("lettuce", "ItemLettuce"),
	SPINACH("spinach", "ItemSpinach"),
	TURNIP("turnip", "ItemTurnip"),
	CORN("corn", "ItemCorn"),
	ONION("onion", "ItemOnion"),
	PICKLE("pickle", "ItemPickle"),
	JALAPENO("jalapeno", "ItemJalapeno"),
	GREENBELLPEPPER("greenbellpepper", "ItemGreenBellPepper"),
	REDBELLPEPPER("redbellpepper", "ItemRedBellPepper"),
	YELLOWBELLPEPPER("yellowbellpepper", "ItemYellowBellPepper"),
	
	//FRUIT
	STRAWBERRY("strawberry", "ItemStrawberry"),
	BLUEBERRY("blueberry", "ItemBlueberry"),
	RASPBERRY("raspberry", "ItemRaspberry"),
	BLACKBERRY("blackberry", "ItemBlackberry"),
	CRANBERRY("cranberry", "ItemCranberry"),
	LEMON("lemon", "ItemLemon"),
	LIME("lime", "ItemLime"),
	ORANGE("orange", "ItemOrange"),
	APPLE("apple", "ItemApple"),
	BANANA("banana", "ItemBanana"),
	GRAPE("grape", "ItemGrape"),
	TOMATO("tomato", "ItemTomato"),
	PINEAPPLE("pinapple", "ItemPineapple"),
	WATERMELON("watermelon", "ItemWatermelon"),
	CANTALOUPE("cantaloupe", "ItemCantaloupe"),
	GRAPEFRUIT("grapefruit", "ItemGrapefruit"),
	COCONUT("coconut", "ItemCoconut"),
	HONEYDEW("honeydew", "ItemHoneydew"),
	PEACH("peach", "ItemPeach"),
	KIWI("kiwi", "ItemKiwi"),
	//NUT
	PEANUT("peanut", "ItemPeanut"),
	PEACAN("peacan", "ItemPeacan"),
	ALMOND("almond", "ItemAlmond"),
	PISTACHIO("pistachio", "ItemPistachio"),
	WALNUT("walnut", "ItemWalnut"),
	CHESTNUT("chestnut", "ItemChestnut"),
	HAZELNUT("hazelnut", "ItemHazelnut"),
	
	//DAIRY
	MILK("milk", "ItemMilk"),
	CHEESE("cheese", "ItemCheese"),
	YOGURT("yogurt", "ItemYogurt"),
	ICECREAM("icecream", "ItemIceCream"),
	HEAVYCREAM("heavycream", "ItemHeavyCream"),
	WHIPPEDCREAM("whippedcream", "ItemWhippedCream"),
	PUDDING("pudding", "ItemPudding"),
	BUTTER("butter", "ItemButter"),
	
	//MISC
	BAKINGPOWDER("bakingpowder", "ItemBakingPowder"),
	BAKINGSODA("bakingsoda", "ItemBakingSoda"),
	BROWNSUGAR("brownsugar", "ItemBrownSugar"),
	CONFECTIONERSSUGAR("confectionerssugar", "ItemConfectionersSugar"),
	SALT("salt", "ItemSalt");
	
	
	
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
