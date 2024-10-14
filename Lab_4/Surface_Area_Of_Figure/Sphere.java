package Lab_4.Surface_Area_Of_Figure;

public class Sphere extends Circle implements Shape3D {    
    private int rad;
    
    public Sphere(int rad){
        super(rad);
        this.rad = rad;
    }

    public double volume(){
        return((4.0/3)*rad*(super.area()));
    }

    public double surfaceArea(){
        return(4*super.area());
    }
}
