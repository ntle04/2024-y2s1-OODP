package Lab_4.Surface_Area_Of_Figure;

public class Circle extends Shape {
    private int rad;

    Circle(int rad){
        this.rad = rad;
    }

    public double area(){
        return(Math.PI*rad*rad);
    }

    public double getRad(){
        return rad;
    }
}
