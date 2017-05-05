package dungeon.util;

public class Dice {
	
	int sides;
	int num;
	
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
	
	public int roll() {
		return this.roll(this.num, this.sides);
	}
	
	public Dice(int num, int sides) {
		this.sides = sides;
		this.num = num;
	}
	
	public Dice() {
		this.sides = 6;
		this.num = 1;
	}
	
}
