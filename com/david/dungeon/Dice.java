package com.david.dungeon;

class Dice {
	/**
	 * Rolls Dice of arbirary geometry
	 *
	 * @param num    Thu number of dice to roll
	 * @param sides  The number of sides for each rolled die
	 * @return       The sum of all die rolls
	*/
	public static int roll(int num, int sides) {
		int total = 0;
		for (int i = num; i > 0; i--) {
			total += (int) (Math.random() * sides) + 1;
		}
		return total;
	}
}
