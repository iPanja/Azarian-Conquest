package com.azarius.utils.capabilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.azarius.utils.data.skilltree.*;
import com.azarius.utils.enums.ProfessionList;

import scala.collection.immutable.List;

public class PlayerData implements IPlayerData{
	
	private ArrayList<AProfession> professions;
	private Runnable addXP;
	
	public PlayerData(List<Integer> xp, Runnable getLevel, Runnable addXP) {
		professions = new ArrayList<AProfession>() {{
			add(new Alchemy());
			add(new Armorsmithing());
			add(new Blacksmithing());
			add(new Carpentry());
			add(new Culinary());
			add(new Leatherworking());
			add(new Weaving());
		}};
		this.addXP = addXP;
	}
	
	@Override
	public int getLevel(ProfessionList profession) {
		return getProfessionClass(profession).getLevel();
	}
	@Override
	public void addXP(ProfessionList profession, int amount) {
		AProfession p = getProfessionClass(profession);
		p.addXP(amount);
		this.addXP.run();
	}
	
	public Map<String, Integer> getStats(){
		Map<String, Integer> stats = new HashMap<String, Integer>();
		for(AProfession p : professions){
			stats.put(p.getProfession().toString(), p.getXP());
		}
		return stats;
	}
	
	private AProfession getProfessionClass(ProfessionList profession) {
		for(AProfession p : professions) {
			if(p.getProfession() == profession)
				return p;
		}
		return null;
	}

	@Override
	public void setStats(Map<String, Integer> stats) {
		for(Map.Entry<String, Integer> entry : stats.entrySet()) {
			ProfessionList p = ProfessionList.valueOf(entry.getKey());
			AProfession profession = getProfessionClass(p);
			profession.setXP(entry.getValue());
		}
	}
}
