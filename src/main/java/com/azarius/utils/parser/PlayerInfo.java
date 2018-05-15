package com.azarius.utils.parser;

public class PlayerInfo {
	public String username;
	public String profession;
	public int money;
	public int xp;
	
	public void loadJson(){
		Parser parser = new Parser();
		@SuppressWarnings("static-access")
		PlayerInfo object = parser.loadPlayer();
		
		username = object.username;
		profession = object.profession;
		money = object.money;
		xp = object.xp;
	}
	@SuppressWarnings("static-access")
	public void saveJson() {
		Parser parser = new Parser();
		parser.savePlayer(this);
	}
}
