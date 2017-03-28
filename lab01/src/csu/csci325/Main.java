package csu.csci325;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double x1, x2, y1, y2, dist; // declaring variables to be used by the program

    System.out.print("Please input two points X1, Y1 and X2, Y2: ");

    // getting user input for the points
    x1 = scan.nextDouble();
    y1 = scan.nextDouble();
    x2 = scan.nextDouble();
    y2 = scan.nextDouble();


    dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); // calculates distance equal to the square root of (x2-x1)^2 + (y2-y1)^2

    System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + dist); // print the coordinates and the distance


    }
}




