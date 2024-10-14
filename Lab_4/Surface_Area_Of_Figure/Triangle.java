package Lab_4.Surface_Area_Of_Figure;

public class Triangle extends Shape{
    private int base, slant;
    
    Triangle(int base, int slant){
        this.base = base;
        this.slant = slant;
    }

    public double area(){
        return (0.5*base*slant);
    }

    public double getBase(){
        return base;
    }

    public double getSlant(){
        return slant;
    }
}
