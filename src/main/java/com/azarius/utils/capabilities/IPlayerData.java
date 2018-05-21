package com.azarius.utils.capabilities;

import java.util.Map;

import com.azarius.utils.data.skilltree.AProfession;
import com.azarius.utils.enums.ProfessionList;

public interface IPlayerData {
	
	public int getLevel(ProfessionList profession);
	public void addXP(ProfessionList profession, int amount);
	public Map<String, Integer> getStats();
	public void setStats(Map<String, Integer> stats);
}
