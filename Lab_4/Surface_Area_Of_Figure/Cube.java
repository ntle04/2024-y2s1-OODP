package Lab_4.Surface_Area_Of_Figure;

public class Cube extends Square implements Shape3D{
    private int length;
    public Cube(int length){
        super(length);
        this.length = length;
    }

    public double surfaceArea(){
        return (super.area()*6);
    }

    public double volume(){
        return(super.area() * length);
    }
}
