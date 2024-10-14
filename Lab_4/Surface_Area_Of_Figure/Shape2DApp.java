package Lab_4.Surface_Area_Of_Figure;

import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int shapeNum, shapeSelect;
        double totalArea = 0; 
        double tempArea;

        System.out.println("Enter the total number of shapes: ");
        shapeNum = sc.nextInt();

        do{
            System.out.printf("Choose your shape: (there is/are %d shape(s) remaining) \n", shapeNum);
            printShapeMenu();
            shapeSelect = sc.nextInt();
            switch(shapeSelect){
                case 1:
                    System.out.println("Square selected!");
                    System.out.printf("Enter length of square: ");
                    int side = sc.nextInt();
                    Square s = new Square(side);
                    tempArea = s.area();
                    totalArea += tempArea;
                    break;
                case 2:
                    System.out.println("Rectangle selected!");
                    System.out.printf("Enter length and width of rectangle, separated by a space: ");
                    int len = sc.nextInt();
                    int wid = sc.nextInt();
                    Rectangle r = new Rectangle(len, wid);
                    tempArea = r.area();
                    totalArea += tempArea;
                    break;
                case 3:
                    System.out.println("Circle selected!");
                    System.out.printf("Enter radius of circle: ");
                    int radius = sc.nextInt();
                    Circle c = new Circle(radius);
                    tempArea = c.area();
                    totalArea += tempArea;
                    break;
                case 4:
                    System.out.println("Triangle selected!");
                    System.out.printf("Enter base and height of triangle, separated by a space: ");
                    int base = sc.nextInt();
                    int height = sc.nextInt();
                    Triangle t = new Triangle(base, height);
                    tempArea = t.area();
                    totalArea += tempArea;
                    break;
            }

            shapeNum--;
        }while(shapeNum > 0);

        System.out.printf("The total area is %.2f", totalArea);
    }
    
    public static void printShapeMenu(){
        System.out.println("1: Square");
        System.out.println("2: Rectangle");
        System.out.println("3: Circle");
        System.out.println("4: Triangle");
    }
}
