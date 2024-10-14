package Lab_4.Surface_Area_Of_Figure;

public class Circle extends Shape {
    private int rad;

    Circle(int rad){
        this.rad = rad;
    }

    public double area(){
        return(2*Math.PI*rad*rad);
    }

    public double getRad(){
        return rad;
    }
}
