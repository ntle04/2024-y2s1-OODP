package Lab_4.Surface_Area_Of_Figure;

public class Rectangle extends Shape{
    private int length, width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    } 

    public double area(){
        return (length*width);
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }
}
