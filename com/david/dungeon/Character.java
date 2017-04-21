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
		this.str = Dice.roll(3,6);
		this.dex = Dice.roll(3,6);
		this.con = Dice.roll(3,6);
		this.intel = Dice.roll(3,6);
		this.wis = Dice.roll(3,6);
		this.chr = Dice.roll(3,6);
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
