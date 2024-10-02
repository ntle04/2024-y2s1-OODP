package Lab_3;

public class Plane {
    private int numEmptySeat; //no. of empty seats
    private PlaneSeat[] seat; //instance variable, info on seats in plane
    private static final int numOfSeats = 12;

    //constructor for class ane
    public Plane(int seats){
        this.seat = new PlaneSeat[numOfSeats];
        this.numEmptySeat = numOfSeats;

        //initialise seats and assign seat id
        for(int i=0; i<numOfSeats; i++){
            this.seat[i] = new PlaneSeat(i+1);
        }
    }

    //method to sort seats according to ascending order of customerID
    private PlaneSeat[] sortSeats(){
        PlaneSeat[] PlaneSeat_copy = new PlaneSeat[12];
        PlaneSeat tempSeat;
        int i;

        //copy contents of seat
        for(i=0; i<12; i++){
            PlaneSeat_copy[i] = seat[i]; // camelCase
        }

        //insertion sort (ascending order)
        for(i=1; i<12; i++){ //ith element
            for(int j=i; j>0; j--){ //j is (i-1)th element
                //check if ith element is less than jth element. if yes, perform swap
                if(PlaneSeat_copy[j].getCustomerID() < PlaneSeat_copy[j-1].getCustomerID()){
                    tempSeat = PlaneSeat_copy[j];
                    PlaneSeat_copy[j] = PlaneSeat_copy[j-1];
                    PlaneSeat_copy[j-1] = tempSeat;
                }
                else break;
            }
        }

        return PlaneSeat_copy;
    }

    //display no. of empty seats
    public void showNumEmptySeats(){
        this.numEmptySeat = 0;
        for(int i=0; i<12; i++){
            if(seat[i].isOccupied() == false){
                this.numEmptySeat++;
            }
        }
        System.out.printf("There is/are %d empty seat(s).\n", this.numEmptySeat);
    }

    //display list of empty seats
    public void showEmptySeats(){
        System.out.println("The following seats are empty:");
        for(int i=0; i<12; i++){
            if(seat[i].isOccupied() == false) { //print seatID if occupied
                System.out.printf("SeatID %d\n", seat[i].getSeatID());
            }
        }
    }
    
    //display assigned seats with seatID and customerID
    public void showAssignedSeats(boolean bySeatId){
        PlaneSeat[] temp = this.seat; //default sorted by customerID
        if(bySeatId == false) temp = sortSeats(); //sort by seatID if needed
        for(int i=0; i<12; i++){
            if(temp[i].isOccupied()){
                System.out.printf("SeatID %d assigned to CustomerID %d.\n", 
                temp[i].getSeatID(), temp[i].getCustomerID());
            }
        }
    }

    //method that assigns customerID to an empty seat
    public void assignSeat(int seatId, int cust_id){
        if (this.seat[seatId-1].isOccupied()){
            System.out.println("Seat already assigned to a customer.");
        }
        else{
            this.seat[seatId-1].assign(cust_id);
            this.numEmptySeat--;    
            System.out.println("Seat Assigned!");
        }
    }

    //method that unassigns a seat
    public void unAssignSeat(int seatId){
        if(this.seat[seatId-1].isOccupied()){
            this.seat[seatId-1].unAssign();
            this.numEmptySeat--;
            System.out.println("Seat Unassigned!");
        }
        else System.out.println("The seat is already occupied!");
    }
}
