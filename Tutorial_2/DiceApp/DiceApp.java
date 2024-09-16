package Tutorial_2.DiceApp;
import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args){
    int total, roll1, roll2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Press <key> to roll the first die");
        sc.next();
        Dice d1 = new Dice();
        roll1 = d1.getDiceValue();
        d1.printDiceValue();

        System.out.println("Press <key> to roll second die");
        sc.next();
        Dice d2 = new Dice();
        roll2 = d2.getDiceValue();
        d2.printDiceValue();
        total = roll1 + roll2;
        System.out.println("Your total number is: " + total);
    }
}
