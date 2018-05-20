package com.azarius.api.profession;


import com.azarius.init.capabilities.IProfession;

public class Profession implements IProfession{
	int[] levelArray = new int[] {100,200,300,400,500,600,700,800,900,1000,1200,1400,1600,1800,2000,2200,2400,2600,2800,3000,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,
	             39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,
	             74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
	/*int[] expArray = new int[] {50, 100, 200, 400, 800, 1600, 3200, 6400, 12800, 25600, 51200, 102400, 204800, 409600};
	*/
	
	int WVexp;
	int CLexp;
	int BSexp;
	int ASexp;
	int LHexp;
	int CAexp;
	
	
	/*Map<Object, Object> levelToExperience = ArrayUtils.toMap(new int[][]{
		{1,50},{2,100},{3,200},{4,400},{5,600},{6,1000}, {7,1400}, {8,1800}, {9,2400}, {10,2800},//ONLY TEST 1-10 FOR PROPER LEVELING GUIDELINES.
		{11,0},{12,0},{13,0},{14,0},{15,0},{16,0}, {17,0}, {18,0}, {19,0}, {20,0},
		{21,50},{22,100},{23,200},{24,400},{25,800},{26,1600}, {27,3200}, {28,6400}, {29,12800}, {30,25600},
		{31,50},{32,100},{33,200},{34,400},{35,800},{36,1600}, {37,3200}, {38,6400}, {39,12800}, {40,25600},
		{41,50},{42,100},{43,200},{44,400},{45,800},{46,1600}, {47,3200}, {48,6400}, {49,12800}, {50,25600},
		{51,50},{52,100},{53,200},{54,400},{55,800},{56,1600}, {57,3200}, {58,6400}, {59,12800}, {60,25600},
		{61,50},{62,100},{63,200},{64,400},{65,800},{66,1600}, {67,3200}, {68,6400}, {69,12800}, {70,25600},
		{71,50},{72,100},{73,200},{74,400},{75,800},{76,1600}, {77,3200}, {78,6400}, {79,12800}, {80,25600},
		{81,50},{82,100},{83,200},{84,400},{85,800},{86,1600}, {87,3200}, {88,6400}, {89,12800}, {90,25600},
		{91,50},{92,100},{93,200},{94,400},{95,800},{96,1600}, {97,3200}, {98,6400}, {99,12800}, {100,25600}});
	*/

	@Override
	public int getProfessionLevel(String tag, int exp) {
		System.out.println("REFED INTO PROFESSION");
		int level = 0;
		System.out.println("VARS DECLARED");
		//int ltx = (Integer) levelToExperience.get(index);
		
		
		for (int i = 0; levelArray[i] <= exp; i++) {
			System.out.println(i);
			if(levelArray[i] >= exp) {
				level = i + 1;
				return level;
			}
		  }
		
		return -1;
	}
	
		
		
		
		/*if(tag.equalsIgnoreCase("WV")) {
			for (int i = 0; ltx <= this.getXP("WV"); i++) {
				i = index;
				
				if(ltx >= this.getXP("WV")) {
					level = i + 1;
					return level;
				}
			  }
			}
		if (tag.equalsIgnoreCase("CL")) {
			for (int i = 0; ltx <= this.getXP("CL"); i++) {
				i = index;
				
				if(ltx >= this.getXP("CL")) {
					level = i + 1;
					return level;
				}
			  }
		}if (tag.equalsIgnoreCase("BS")) {
			for (int i = 0; ltx <= this.getXP("BS"); i++) {
				i = index;
				
				if(ltx >= this.getXP("BS")) {
					level = i + 1;
					return level;
				}
			  }
		}if (tag.equalsIgnoreCase("AS")) {
			for (int i = 0; ltx <= this.getXP("AS"); i++) {
				i = index;
				
				if(ltx >= this.getXP("AS")) {
					level = i + 1;
					return level;
				}
			  }
		}if (tag.equalsIgnoreCase("LH")) {
			for (int i = 0; ltx <= this.getXP("LH"); i++) {
				i = index;
				
				if(ltx >= this.getXP("LH")) {
					level = i + 1;
					return level;
				}
			  }
		}if (tag.equalsIgnoreCase("CA")) {
			for (int i = 0; ltx <= this.getXP("CA"); i++) {
				i = index;
				
				if(ltx >= this.getXP("CA")) {
					level = i + 1;
					return level;
				}
			  }
		}*/
	

	@Override
	public void setXP(int exp, String tag) {
		System.out.println("REFED PROFESSIONS");
		if(tag.equalsIgnoreCase("WV")) {
			this.WVexp = exp;
		}if (tag.equalsIgnoreCase("CL")) {
			System.out.println("Your COmmand is just retarded");
			this.CLexp = exp; 
		}if (tag.equalsIgnoreCase("BS")) {
			this.BSexp = exp;
		}if (tag.equalsIgnoreCase("AS")) {
			this.ASexp = exp;
		}if (tag.equalsIgnoreCase("LH")) {
			this.LHexp = exp;
		}if (tag.equalsIgnoreCase("CA")) {
			this.CAexp = exp;
		}
	}


	@Override
	public int getXP(String tag) {
		if(tag.equalsIgnoreCase("WV")) {
			return this.WVexp;
		}if (tag.equalsIgnoreCase("CL")) {
			return this.CLexp; 
		}if (tag.equalsIgnoreCase("BS")) {
			return this.BSexp;
		}if (tag.equalsIgnoreCase("AS")) {
			return this.ASexp;
		}if (tag.equalsIgnoreCase("LH")) {
			return this.LHexp;
		}if (tag.equalsIgnoreCase("CA")) {
			return this.CAexp;
		}else return 0;
	}

	
	
}
