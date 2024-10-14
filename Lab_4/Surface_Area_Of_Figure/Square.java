package Lab_4.Surface_Area_Of_Figure;

public class Square extends Shape {
    int length, width, height;
    
    Square(int length){
        this.length = length;
    }
    
    public double area(){
        return (double)(length*length);
    }
}
