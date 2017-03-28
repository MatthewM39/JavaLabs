/**
 * Created by Matthew on 9/15/2015.
 */


package csu.lab4;


public class Main {

    public static void main(String[] args) {

        Die die1 = new Die();
        Die die2 = new Die();

        die1.inputDie(die1, "first");
        die2.inputDie(die2, "second");


        System.out.print("The sum is: " + (die1.getFaceValue() + die2.getFaceValue()));
    }
}


