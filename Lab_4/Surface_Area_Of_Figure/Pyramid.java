package Lab_4.Surface_Area_Of_Figure;

public class Pyramid extends Triangle implements Shape3D {
    private int height, base;

    public Pyramid(int base, int slant, int height){
        super(base, slant);
        this.height = height;
        this.base = base;
    }

    public double surfaceArea(){
        return(4*(super.area()) + (base*base));
    }

    public double volume(){
        return (base*base*(1.0/3)*height);
    }
}
