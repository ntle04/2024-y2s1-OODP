package Lab_4.Surface_Area_Of_Figure;

import java.util.Scanner;

public class Shape3DApp {
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
                    System.out.println("Cube selected!");
                    System.out.printf("Enter length of Cube: ");
                    int side = sc.nextInt();
                    Cube c = new Cube(side);
                    tempArea = c.surfaceArea();
                    totalArea += tempArea;
                    break;
                case 2:
                    System.out.println("Cuboid selected!");
                    System.out.printf("Enter length of cube and depth of cuboid, separated by a space: ");
                    int len = sc.nextInt();
                    int dep = sc.nextInt();
                    Cuboid cb = new Cuboid(len, dep);
                    tempArea = cb.surfaceArea();
                    totalArea += tempArea;
                    break;
                case 3:
                    System.out.println("Spehere selected!");
                    System.out.printf("Enter radius of sphere: ");
                    int radius = sc.nextInt();
                    Sphere s = new Sphere(radius);
                    tempArea = s.surfaceArea();
                    totalArea += tempArea;
                    break;
                case 4:
                    System.out.println("Square-based pyramid selected!");
                    System.out.printf("Enter base, slant height and height, separated by a space: ");
                    int base = sc.nextInt();
                    int sHeight = sc.nextInt();
                    int height = sc.nextInt();
                    Pyramid p = new Pyramid(base, sHeight,height);
                    tempArea = p.surfaceArea();
                    totalArea += tempArea;
                    break;
                case 5:
                    System.out.println("Cone selected!");
                    System.out.printf("Enter radius and height, separated by a space: ");
                    int r = sc.nextInt();
                    int h = sc.nextInt();
                    Cone cn = new Cone(r, h);
                    tempArea = cn.surfaceArea();
                    totalArea += tempArea;
                    break;
                case 6:
                    System.out.println("Cylinder selected!");
                    System.out.printf("Enter radius and height, separated by a space: ");
                    int rad = sc.nextInt();
                    int ht = sc.nextInt();
                    Cylinder cy = new Cylinder(rad, ht);
                    tempArea = cy.surfaceArea();
                    totalArea += tempArea;
                    break;
            }

            shapeNum--;
        }while(shapeNum > 0);

        System.out.printf("The total surface area is %.2f", totalArea);
    }
    
    public static void printShapeMenu(){
        System.out.println("1: Cube");
        System.out.println("2: Cuboid");
        System.out.println("3: Sphere");
        System.out.println("4: Square-Based Pyramid");
        System.out.println("5: Cone");
        System.out.println("6: Cylinder");
    }
}
