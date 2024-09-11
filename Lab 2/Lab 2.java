import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtration");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.printf("Enter a number and a divisor, separated by a space: ");
                    int num1 = sc.nextInt();
                    int div = sc.nextInt();
                    divide(num1, div);
                    break;
                case 3:
                    System.out.printf("Enter a number and a divisor, separated by a space: ");
                    int num2 = sc.nextInt();
                    int mod = sc.nextInt();
                    modulus(num2, mod);
                    break;
                case 4:
                    System.out.printf("Enter a number: ");
                    int num3 = sc.nextInt();
                    countDigits(num3);
                    break;
                case 5:
                    System.out.printf("Enter a number and a digit, separated by a space: ");
                    int num4 = sc.nextInt();
                    int digit = sc.nextInt();
                    position(num4, digit);
                    break;
                case 6:
                    System.out.printf("Enter a number: ");
                    long num5 = sc.nextLong();
                    extractOddDigits(num5);
                    break;
                case 7:
                    System.out.println("Program terminating...");
            }
        } while (choice<7);
        //method code
    }
    public static void mulTest(){
        int count = 0;
        for(int i=0; i<5; i++){
            int num1 = (int)(Math.random()*9 + 1); //1 to 9
            int num2 = (int)(Math.random()*9 + 1); 

            System.out.printf("How much is " + num1 + " times " + num2 + "? ");
            Scanner sc = new Scanner(System.in);
            int mul = sc.nextInt();
            if (mul == num1*num2){
                count++;
            }
        }
        System.out.println(count + " answers out of 5 are correct.");
        System.out.println();
    }
    
    public static int divide(int m, int n){
        int count = 0;
        int num = m; 
        while(num>=n){
            num -= n;
            count++;
        }
        System.out.println(m + "/" + n + " = " + count);
        System.out.println();
        return count;
    }

    public static int modulus(int m, int n){
        int rem = m; 
        while(rem>=n){
            rem -= n;
        }
        System.out.println(m + " % " + n + " = " + rem);
        System.out.println();
        return rem;
    }

    public static int countDigits(int n){
        int num = n; int dig = 0;
        if (num<0){
            System.out.println("n: " + n + " - Error input!!");
            return dig;
        }
        while(num != 0){
            num /= 10;
            ++dig;
        }
        System.out.println("n: " + n + " - count = " + dig);
        return dig;
    }

    public static int position(int n, int digit){
        int rem;
        int position = 1;
        while(n>0){
            ++position;
            n /= 10;
            rem = n % 10;
            if(rem==digit){
                System.out.println("position = " + position);
                return position;
            }
        }
        System.out.println("position = -1");
        return position;
    }

    public static long extractOddDigits(long n){
        long rem = -1;
        String output = "";
        boolean flag = false;
        if(n<0){
            System.out.println("oddDigits = Error input!!");
            return rem;
        }
        while(n>0){
            rem = n % 10;
            if(rem % 2 == 1){
                output = rem + output;
                flag = true;
            }
            n /= 10;
        }
        if(flag){
            System.out.println("oddDigits = " + output);
            return rem;
        }
        System.out.println("oddDigits = -1");
        return rem;
    }
}
