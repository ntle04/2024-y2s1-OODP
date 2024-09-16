package Tutorial3.VendingMachineApp;

public class VendingMachineApp {
    public static void main(String[] args){
        VendingMachine vm = null;

        printMenu();
        vm = new VendingMachine();
        double toPay = vm.selectDrink();
        printCoinsInput();
        double paid = vm.insertCoins(toPay);
        vm.checkChange(paid, toPay);
        vm.printReceipt();
    }
        

    public static void printMenu(){
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00)        |");
        System.out.println("|2. Buy Coke ($1.00)        |");
        System.out.println("|3. Buy Green Tea ($5.00)   |");
        System.out.println("=============================");
    }

    public static void printCoinsInput(){
        System.out.println("Please insert coins: ");
        System.out.println("========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input   |");
        System.out.println("|Enter 'T' for twenty cents input|");
        System.out.println("|Enter 'F' for fifty cents input |");
        System.out.println("|Enter 'N' for a dollar input    |");
        System.out.println("==================================");
    }
}
