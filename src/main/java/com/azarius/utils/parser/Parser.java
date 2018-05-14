package com.azarius.utils.parser;

import java.io.FileReader;
import java.io.PrintWriter;

import com.google.gson.Gson;

public class Parser {
	
	public static PlayerInfo loadPlayer(){
		Gson parser = new Gson();
		PlayerInfo object = null;
		try {
			System.out.println("B Working Directory: " + System.getProperty("user.dir"));
			object = parser.fromJson(new FileReader("src/main/resources/assets/ac/json/playerInfo.json"), PlayerInfo.class);
		} catch (Exception e) {
			System.out.println("An error has occured in Parser.loadPlayer()");
			e.printStackTrace();
		}
		return object;
	}
	public static void savePlayer(PlayerInfo playerInfo) {
		Gson parser = new Gson();
		String json = parser.toJson(playerInfo);
		
		try(PrintWriter out = new PrintWriter("src/main/resources/assets/ac/json/playerInfo.json")){
			out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
