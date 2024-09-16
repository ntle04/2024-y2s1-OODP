package Tutorial3.VendingMachineApp;
import java.util.Scanner;

public class VendingMachine{
    //constructor 
    public VendingMachine(){    }
    Scanner sc = new Scanner(System.in);

    //get drink selection and return cost of drink
    public double selectDrink(){
        System.out.println("Please enter selection:");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                return 3.00;
            case 2:
                return 1.00;
            case 3:
                return 5.00;
            default:
                System.out.println("Invalid selection!");
        }
        return 0.00;
    }

    //insert coins and return amount inserted
    public double insertCoins(double drinkCost){
        double amount = 0.00;
        do{
            String coin = "";
            coin = sc.next();
            switch(coin){
                case "Q":
                case "q":
                    amount += 0.10;
                    break;
                case "T":
                case "t":
                    amount += 0.20;
                    break;
                case "F":
                case "f":
                    amount += 0.50;
                    break;
                case "N":
                case"n":
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
        return;
    }

    //print receipt and collect drink
    public void printReceipt(){
        System.out.println("Please collect your drink");
        System.out.println("Thank you !!");
    }
}