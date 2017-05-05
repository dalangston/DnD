package dungeon;

public class Main {
  public static void main(String[] args) {
    
    Dungeon world = new Dungeon();
    
		System.out.println("Generating new character...");
		//Character myChar = new Character("Timmy");
		Character myChar = new Character();
		System.out.println("Here is your new character:");
		myChar.printChar();
	}
}