package Lab_4.Polymorphic_Sorting;

public class d_SalePerson implements Comparable<Object>{
    private String firstName;
    private String lastName;
    private int totalSales;

    //constructor
    public d_SalePerson(String firstName, String lastName, int totalSales){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }
    
    public String toString(){
        return (this.lastName+ ", " + this.firstName + " : " + this.totalSales);
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof d_SalePerson)) return false;

        d_SalePerson SP = (d_SalePerson) o;
        return(this.firstName == SP.firstName && this.lastName == SP.lastName);
    }

    public int compareTo(Object o){
        if(o instanceof d_SalePerson){
            d_SalePerson SP = (d_SalePerson) o;
            if(SP.totalSales != this.totalSales){
                return this.totalSales - SP.totalSales;
            }
            else{
                return SP.lastName.compareTo(this.lastName);
            }
        }
        else return 0;
    }
}
