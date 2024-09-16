package Tutorial3.VendingMachineApp;

public class VendingMachineApp {
    public static void main(String[] args){
        VendingMachine vm = null;

        vm = new VendingMachine();
        double toPay = vm.selectDrink();
        double paid = vm.insertCoins(toPay);
        vm.checkChange(paid, toPay);
        vm.printReceipt();
    }

}
