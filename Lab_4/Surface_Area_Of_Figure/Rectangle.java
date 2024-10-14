package Lab_4.Surface_Area_Of_Figure;

public class Rectangle extends Shape{
    int length, width, height;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    } 

    public double area(){
        return (length*width);
    }
}
