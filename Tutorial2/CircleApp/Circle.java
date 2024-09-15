package Tutorial2.CircleApp;

public class Circle{
    private double radius;
    private static final double PI = 3.14159; //final makes constant PI immutable

    public Circle(double rad){ //constructor
        radius = rad;
    }

    public void setRadius(double rad){ //mutator method - set radius
        radius = rad;
    }

    public double getRadius(){ //accessor method - get radius
        return radius;
    }

    public double area(){ //calculate area
        return(PI*radius*radius);
    }

    public double circumference(){ //calculate circumference
        return(2*PI*radius);
    }

    public void printArea(){ //print area
        System.out.println("Area of circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    public void printCircumference(){ //print circumference
        System.out.println("Circumference of circle");
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference());
    }
}