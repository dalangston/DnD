package com.david.dungeon;

/**
 * Create a character based loosely on AD&D 2nd Edition rules
  */
class Character {
	int str;
	int dex;
	int con;
	int intel;
	int wis;
	int chr;

	String name;

	Character() {
		statGen();
		nameGen();
	}

	Character(int str, int dex, int con, int intel, int wis, int chr) {
		setStats( str,  dex,  con,  intel,  wis,  chr);
	}


	Character(int str, int dex, int con, int intel, int wis, int chr, String name) {
		setStats( str,  dex,  con,  intel,  wis,  chr);
		setName(name);
	}

	Character(String name) {
		setName(name);
	}

	void setStats(int str, int dex, int con, int intel, int wis, int chr) {
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.chr = chr;
	}

	void statGen() {
		
		Dice statDie = new Dice(3, 6);  // Roll 3d6 for standard PC stats
		
		this.str = statDie.roll();
		this.dex = statDie.roll();
		this.con = statDie.roll();
		this.intel = statDie.roll();
		this.wis = statDie.roll();
		this.chr = statDie.roll();
	}

	void nameGen() {
		this.name = "The Real Slim Shady";
	}

	void setName(String name) {
		this.name = name;
	}

	public void printChar() {
		System.out.println(this.name);
		System.out.println("STR:  " + this.str + " \tINT:  " + this.intel);
		System.out.println("DEX:  " + this.dex + " \tWIS:  " + this.wis);
		System.out.println("CON:  " + this.con + " \tCHR:  " + this.chr);
	}

}
