package Tutorial_2.CircleApp;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        double radius = 0.0;
        Circle c = null;
        
        
        do{
            printMenu();
            System.out.println("Choose option (1-3):");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    radius = sc.nextDouble();
                    c = new Circle(radius);
                    System.out.println("A new circle is created");
                    break;
                case 2:
                    if(c != null){
                        c.printArea();
                    }
                    else{
                        System.out.println("Circle does not exist!");
                    }
                    break;
                case 3:
                    if(c != null){
                        c.printCircumference();
                    }
                    else{
                        System.out.println("Circle does not exist!");
                    }
                    break;
                default:
                    System.out.println("Pick a number from 1-3!!");
            }
        } while(choice!=4);
        System.out.println("Thank you!!");
    }

    private static void printMenu(){
        System.out.println("==== Circle Computation =====");
        System.out.println("|1. Create a new circle     |");
        System.out.println("|2. Print area              |");
        System.out.println("|3. Print circumference     |");
        System.out.println("|4. Quit                    |");
        System.out.println("=============================");
    }
}


/*
Abstraction: hiding complexity behind easy to understand interfaces
    Getters and setters are used to access private attributes
    --> setter can indicate a behaviour / logic, i.e. only accept positive attributes
    --> getter can access combination of setters/getters, i.e. fullname = firstname + lastname 

    always try and abstract to accomodate for new objects (anticipated)
    --> i.e. ensure that only classes need to be added

polymorphism: single method that takes different forms
    use an interface: special blueprint class w/o implementation/realisation
    --> gives the signature of the methods
    --> e.x. public class Circle implements Circular{
        ...
        circular.printCircumference();
        }

*/