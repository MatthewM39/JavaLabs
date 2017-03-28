package csu.csci325;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Converter myConv = new Converter();
        String myNumString = new String();
        Integer myInt = 0;

        // test with no numbers
        System.out.println("Testing string \"corgi\": " + myConv.convertToInteger("corgi"));

        // mix of numbers and characters
        System.out.println("Testing string \"10c\": " + myConv.convertToInteger("10c"));

        // accepts numbers
        System.out.println("Testing string \"100\": " + myConv.convertToInteger("100"));

        // accepts numbers with a sign
        System.out.println("Testing string \"-100\": " + myConv.convertToInteger("-100"));



    }
}
