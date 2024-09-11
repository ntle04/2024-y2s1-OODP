package Tutorial 2.CircleApp;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Circle Computation =====");
        System.out.println("|1. Create a new circle     |");
        System.out.println("|2. Print area              |");
        System.out.println("|3. Print circumference     |");
        System.out.println("|4. Quit                    |");
        System.out.println("===============================");
        do{
            System.out.println("Choose option (1-3):");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Thank you!!");
                    break;
            }
        } while(choice<5);
    }
}
