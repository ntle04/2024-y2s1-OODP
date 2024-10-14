package Lab_4.Surface_Area_Of_Figure;

public class Cuboid extends Square implements Shape3D{
    private double depth;

    public Cuboid(int length, int depth){
        super(length);
        this.depth = depth;
    }

    public double surfaceArea(){
        double length = super.getLength();
        return((2*super.area()) + 4*length*depth);
    }

    public double volume(){
        return (super.area()*depth);
    }
}
