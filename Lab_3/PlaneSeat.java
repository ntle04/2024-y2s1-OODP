package Lab_3;

public class PlaneSeat{
    private int seatId, customerId;
    private boolean assigned;
    
    //constructore
    public PlaneSeat(int seat_id){
        this.seatId = seat_id;
        this.assigned = false;
        this.customerId = 0;
    }
    
    //returns seat number
    public int getSeatID(){
        return this.seatId;
    }

    //returns customer number
    public int getCustomerID(){
        return this.customerId;
    }

    //returns whether seat is occupied
    public boolean isOccupied(){
        return this.assigned;
    }

    //assigns seat to a customer
    public void assign(int cust_id){
        this.customerId = cust_id;
        this.assigned = true;
    }

    //unassigns a seat
    public void unAssign(){
        this.customerId = 0;
        this.assigned = false;
    }
}