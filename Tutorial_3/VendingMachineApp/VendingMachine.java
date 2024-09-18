package Tutorial_3.VendingMachineApp;
import java.util.Scanner;

public class VendingMachine{
    //constructor 
    public VendingMachine(){    }
    Scanner sc = new Scanner(System.in);

    //get drink selection and return cost of drink
    public double selectDrink(){
        int choice =0;
        printMenu();
        do{
            System.out.println("Please enter selection:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    return 3.00;
                case 2:
                    return 1.00;
                case 3:
                    return 5.00;
                default:
                    System.out.println("Enter a valid drink selection (1-3)!");
            }
        }while((choice!=0));
        return 0.00;
    }

    //insert coins and return amount inserted
    public double insertCoins(double drinkCost){
        double amount = 0.00;
        printCoinsInput();
        do{
            String coin = "";
            coin = sc.next();
            switch(coin){
                case "Q": case "q":
                    amount += 0.10;
                    break;
                case "T": case "t":
                    amount += 0.20;
                    break;
                case "F": case "f":
                    amount += 0.50;
                    break;
                case "N": case"n":
                    amount += 1.00;
                    break;
                default:
                    System.out.println("Enter a valid coin selection!");
            }
            System.out.printf("Coins inserted: %.2f\n", amount);
        } while(amount < drinkCost);
        return amount;
    }

    //check change and print change on screen
    public void checkChange(double amount, double drinkCost){
        if(amount >= drinkCost){
            System.out.printf("Change: $ %.2f\n", (amount - drinkCost));
        }
    }

    //print receipt and collect drink
    public void printReceipt(){
        System.out.println("Please collect your drink");
        System.out.println("Thank you !!");
    }

    public static void printMenu(){
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00)        |");
        System.out.println("|2. Buy Coke ($1.00)        |");
        System.out.println("|3. Buy Green Tea ($5.00)   |");
        System.out.println("=============================");
    }

    public static void printCoinsInput(){
        System.out.println("Please insert coins: ");
        System.out.println("========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input   |");
        System.out.println("|Enter 'T' for twenty cents input|");
        System.out.println("|Enter 'F' for fifty cents input |");
        System.out.println("|Enter 'N' for a dollar input    |");
        System.out.println("==================================");
    }
}