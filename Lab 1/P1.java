import java.util.Scanner;

public class P1
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input your choice:");
        String Choice = obj.nextLine();

        switch(Choice){
            case "a":
            case "A":
                System.out.println("Action movie fan");
                break;
            case "c":
            case "C":
                System.out.println("Comedy movie fan");
                break;
            case "d":
            case "D":
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
