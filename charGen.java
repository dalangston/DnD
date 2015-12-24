//package charGen;

class charGen {

    public static void main(String[] args) {
        MyChar jim = new MyChar();
        System.out.println(jim);
    }
}

class MyChar {

    String charName = "";

    int Str = 0;
    int Dex = 0;
    int Con = 0;
    int Int = 0;
    int Wis = 0;
    int Chr = 0;

    public MyChar() {
        this.Str = Dice.roll(3, 6);
        this.Dex = Dice.roll(3, 6);
        this.Con = Dice.roll(3, 6);
        this.Int = Dice.roll(3, 6);
        this.Wis = Dice.roll(3, 6);
        this.Chr = Dice.roll(3, 6);

        this.charName = nameGenerator();
    }

    String nameGenerator() {
        String myName = "";

        String[] firstNames = {"Dave", "Diane", "Salomon", "Sarah", "Matt",
            "Matti", "Joe", "Jane"};
        String[] lastNames = {"Townsend", "Donaldson", "Livington",
            "Ducksworth", "Appleton", "Friday", "Beatsworth"};
        String[] titles = {"The Great", "The Holy", "The Humble", "The Savior",
            "The Destoyer", "The Kind"};

        myName += firstNames[(int)(Math.random() * firstNames.length)];
        myName += " " + lastNames[(int)(Math.random() * lastNames.length)];
        myName += " " + titles[(int)(Math.random() * titles.length)];

        return myName;
    }

     public void printChar() {
        System.out.println("Str: " + this.Str + "\tInt: " + this.Int);
        System.out.println("Dex: " + this.Dex + "\tWis: " + this.Wis);
        System.out.println("Con: " + this.Con + "\tChr: " + this.Chr);
     }
     public String toString() {
         String charString = "Name: " + this.charName + "\n\n";
         charString += "Str: " + this.Str + "\tInt: " + this.Int + "\n";
         charString += "Dex: " + this.Dex + "\tWis: " + this.Wis + "\n";
         charString += "Con: " + this.Con + "\tChr: " + this.Chr + "\n";

         return charString;
     }

}

class Dice {
    static int roll(int num, int sides) {
        int total = 0;
        for (int i = 0; i < num; i++) {
            total += Math.floor((Math.random() * sides) + 1);
        }
        return total;
    }
}
