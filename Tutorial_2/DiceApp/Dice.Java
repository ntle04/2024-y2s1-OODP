package Tutorial2.DiceApp;

public class Dice{
    private int diceValue=1;

    public Dice(){
        setDiceValue();
    }

    public void setDiceValue(){
        diceValue = (int)(Math.random()*6)+1;
    }

    public int getDiceValue(){
        return diceValue;
    }

    public void printDiceValue(){
        System.out.println("Current value is " + diceValue);
    }
}