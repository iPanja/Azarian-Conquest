package com.azarius.utils.enums;

public enum ProfessionList {
//EG (Culinary, Culinarian, 1) primary, secondary, ID
	
		CULINARY("Culinary", "Culinarian", 1),
		LEATHERWORKING("Leatherworking", "Leatherworker", 2),
		WEAVING("Weaving", "Weaver", 3),
		ARMORSMITHING("Armorsmithing", "Armorsmith", 4),
		BLACKSMITHING("Blacksmithing", "Blacksmith", 5),
		ALCHEMY("Alchemy", "Alchemist", 6),
		CARPENTRY("Carpentry", "Carpenter", 7);
	
	
		private String rolename;
		private String secondaryname;
		private int id;
	
		ProfessionList(String rolename, String secondaryname, int id){
			this.rolename = rolename;
			this.secondaryname = secondaryname;
			this.id = id;
		}
	
		
		public String getProfessionName() {
			return rolename;
		}
	
		public int getProfessionID() {
			return id;
		}
		
		public String getSecondaryName() {
			return secondaryname;
		
		}
	
}
