package Lab_4.Surface_Area_Of_Figure;

public class Cone extends Circle implements Shape3D{
    private int rad, height;
    public Cone(int radius, int height){
        super(radius);
        this.rad = radius;
        this.height = height;
    }

    public double surfaceArea(){
        double slant = Math.sqrt(rad*rad + height*height);
        return (super.area() + Math.PI*rad*slant);
    }

    public double volume(){
        return ((1.0/3)*super.area()*height);
    }
}
