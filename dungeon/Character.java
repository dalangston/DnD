package dungeon;
//package com.david.dungeon;

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
	
	Dice statDie = new Dice(3,6);  // Roll 3d6 for standard PCs

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
		this.str = this.statDie.roll();
		this.dex = this.statDie.roll();
		this.con = this.statDie.roll();
		this.intel = this.statDie.roll();
		this.wis = this.statDie.roll();
		this.chr = this.statDie.roll();
	}

	void nameGen() {
		this.name = "The Real Slim Shady";
	}

	void setName(String name) {
		this.name = name;
	}

	public void printChar() {
		System.out.format("Name: %s \n", this.name);
		System.out.format("STR: %d  \t INT: %d \n", this.str, this.intel);
		System.out.format("DEX: %d  \t WIS: %d \n", this.dex, this.wis);
		System.out.format("CON: %d  \t CHR: %d \n", this.con, this.chr);
	}

}
