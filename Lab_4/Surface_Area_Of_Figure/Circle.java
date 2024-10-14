package Lab_4.Surface_Area_Of_Figure;

public class Circle extends Shape {
    int rad;
    final double  PI = 3.14159;

    Circle(int rad){
        this.rad = rad;
    }

    public double area(){
        return(2*PI*rad*rad);
    }
}
