/**
 * Created by Matthew on 9/15/2015.
 */

package csu.lab4;

import java.util.Scanner;

public class Die {


    private final int MAX = 6;  //max number of sides on a die

    private int faceValue;

    public Die(){
        faceValue = 1;
    }

    // returns a number 1 through 6 inclusive
    public int roll()
    {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }

    // sets the face value of a die
    public void setFaceValue(int value){
        if (value > 0 && value <= MAX)
            faceValue = value;
    }

    // returns the face value of a die
    public int getFaceValue(){
        return faceValue;
    }

    // converts the face value to a string
    public String toString(){
        String result = Integer.toString(faceValue);
        return result;
    }


    // get user input for the value of the die and returns the die
    public Die inputDie(Die inputDie, String dieCount) {

        Boolean isSearching = true;
        int userInput;
        Scanner scan = new Scanner(System.in);

        while (isSearching) {
            System.out.print("Enter a number for the " + dieCount + " die:"); //concatenates based on which die it is
            userInput = scan.nextInt(); // get user input for the int

            // sets a random number between 1 and 6 if -1 is inputted
            if (userInput == -1) {
                inputDie.setFaceValue(inputDie.roll());
                isSearching = false;
            }

            // sets the user inputted number if it is between 1 and 6
            else if (userInput >= 1 && userInput <= 6) {
                inputDie.setFaceValue(userInput);
                isSearching = false;
            }
        }

        return inputDie;
    }


}
