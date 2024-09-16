package Tutorial3.Cylinder;

public class Circle extends Point {
    private double radius;
    public final double PI = 3.14159;

    public Circle(){ //constructor
        this(1,1);
    }

    public void setRadius(double rad){ //mutator method - set radius
        super(x,y);
    }

    public double getRadius(){ //accessor method - get radius
        return this.radius;
    }

    public double area(){ //calculate area
        return(PI*radius*radius);
    }
    public String toString(){
        String s = "[" + x + "," + y + "]";
        return s;
    }
}