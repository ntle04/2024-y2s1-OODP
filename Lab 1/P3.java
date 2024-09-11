import java.util.Scanner;
public class P3{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("starting : ");
        int start = obj.nextInt();

        System.out.print("ending   : ");
        int end = obj.nextInt();

        System.out.print("increment: ");
        int inc = obj.nextInt();

        if(start>end){
            System.out.println("Error input!!");
            return;
        }

        System.out.println("US$         S$");
        System.out.println("---------------");
        for(int i=start; i<=end; i+=inc){
            System.out.format("%d\t%.2f\n", i, (i*1.82));
        }
        
        System.out.println("");
        System.out.println("US$         S$");
        System.out.println("--------------");
        int j = start;
        while(j<=end){
            System.out.format("%d\t%.2f\n", j, (j*1.82));
            j+=inc;
        }

        System.out.println("");
        System.out.println("US$         S$");
        System.out.println("--------------");
        int k = start;
        do { 
            System.out.format("%d\t%.2f\n", k, (k*1.82));
            k+=inc;
        } while (k<=end);
    }
}
