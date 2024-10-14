package Lab_4.Surface_Area_Of_Figure;

public class Triangle extends Shape{
    int base, slant, height;
    
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        return (0.5*base*slant);
    }
}
