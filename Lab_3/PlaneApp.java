package Lab_3;
import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Plane aeroplane = null;
        aeroplane = new Plane(12); 
        int choice = 0;
        boolean seatSorted = false;

        printMenu();

        do{
            System.out.println("  Enter the number of your choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    aeroplane.showNumEmptySeats();
                case 2:
                    aeroplane.showEmptySeats();
                case 3:
                    seatSorted = true;
                    aeroplane.showAssignedSeats(seatSorted);
                case 4:
                    aeroplane.showAssignedSeats(seatSorted);
                case 5:
                    System.out.println("Assigning seat ..");
                    System.out.printf("  Please enter Seat ID: ");
                    int newSeatNum = sc.nextInt();
                    System.out.printf("  Please enter Customer ID: ");
                    int cusNum = sc.nextInt();
                    aeroplane.assignSeat(newSeatNum, cusNum);
                case 6:
                    System.out.println("  Enter SeatID to unassign customer from: ");
                    int oldSeatNum = sc.nextInt();
                    aeroplane.unAssignSeat(oldSeatNum);
                default:
                    return;
            }
        
        }while(choice != 0);
    }

    public static void printMenu(){
        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a cutsomer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");
    }
    
}
