package Lab_4.Surface_Area_Of_Figure;

public class Cylinder extends Circle implements Shape3D {
    private int h, r;

    public Cylinder(int rad, int height){
        super(rad);
        this.h = height;
        this.r = rad;
    }

    public double surfaceArea(){
        return(2*super.area() + 2*Math.PI*r*h);
    }

    public double volume(){
        return(super.area() * h);
    }
}
