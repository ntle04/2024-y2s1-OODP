import java.util.Scanner;

public class P2 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Input salary");
        int salary = obj.nextInt();

        System.out.println("Input merit points");
        int merit = obj.nextInt();

        char grade;        
        if(500<=salary && salary<650){
            if(600<=salary && salary<650 && merit>=10){
                grade = 'B';
            }
            else{
                grade = 'C';
            }
        }
        else if(650<= salary && salary<800){
            if(700<=salary && salary<800 && merit>=20){
                grade = 'A';
            }
            else{
                grade = 'B';
            }
        }
        else{
            grade = 'A';
        }
    System.out.println("Salary      : $" + salary);
    System.out.println("Merit points: " + merit);
    System.out.println("Grade       : " + grade);
    }
}
