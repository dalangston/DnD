package com.david.dungeon;

/**
 * Dungeon crawl based loosely on AD&D 2nd Edition rules
 *
 * @author		David Langston
 * @version		0.1		21 May 2017
 */
class Dungeon {

	Dungeon() {
		System.out.println("\t\tYou have entered a dungeon.\n\n");
	}

	public static void main(String[] args) {
		System.out.println("Generating new character...");
		//Character myChar = new Character("Timmy");
		Character myChar = new Character();
		System.out.println("Here is your new character:");
		myChar.printChar();
	}
}
