import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Matthew on 10/5/2015.
 */

public class IntegerCount {

    // range for the counting is 1 - 100
    private final int LIMIT = 100;
    int[] countInts = new int[LIMIT];

    // accepts an int as a parameter and checks if it is valid, then calls GetOccurences
    public void account(int val) {
       if( val < 101 && val > 0){
           GetOccurences(val);
       }
    }

    // adds an occurence to the selected int. (subtracts one because indexes start at 0)
    public void GetOccurences(int val){
       countInts[val - 1]++;
    }

    // loops through the array and prints only the values which increased
    public void print(){
       for ( int i = 0; i < LIMIT; i++){
           if (countInts[i] > 0){
               System.out.println((i + 1) + ": " + countInts[i]);
           }
       }
    }

    public int returnVal(int index){

        if (index > 99 || index < 0){
            return 0;
        }
        int test = countInts[index];
        return test;
    }

}
