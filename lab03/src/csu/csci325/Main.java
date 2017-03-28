package csu.csci325;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int minNum = 2; // declaring a constant so the min number can be changed
        int inputX = 0, result = 0, counter = (minNum); // variables used by this program


        Scanner scan = new Scanner(System.in);

        // gets user input for the max value until an integer greater than 1 is entered.
        while (inputX < minNum) {
            System.out.print("Input an integer greater than 1: ");
            inputX = scan.nextInt();
            if (inputX < minNum) {
                System.out.println("Error! Integer must be greater than 1.");
            }
        }

        // while the counter is smaller than or equal to in size of the maximum, this loop will run
        while (counter <= inputX) {

            if ((counter % 2) == 0) {
                result += counter; // adds the current number to the result if it is even
            }
            counter++;
        }

        System.out.println("The sum of even integers between " + minNum + " and " + inputX
                + " is " + result);
    }
}

