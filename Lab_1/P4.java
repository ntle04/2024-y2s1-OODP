import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Input height: ");
        int h = obj.nextInt();
        for(int i=0; i<=h; i++){
            if(i%2 == 1){
                System.out.printf("AA" + "BBAA".repeat((i-1)/2) + "\n");
            }
            else{
                System.out.printf("BBAA".repeat(i/2) + "\n");
            }
        }
    }
}
