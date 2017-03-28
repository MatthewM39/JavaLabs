package csu.csci325;

/**
 * Created by Matthew on 11/3/2015.
 */


public class Converter {
    public static Integer convertToInteger(String str) {


        // try to convert the string to an int
        try{
            Integer myInt = 0;
            myInt = myInt.parseInt(str);
            return myInt;

        }

        // catches invalid character input in the string
        catch(NumberFormatException exception){
            System.err.println("This program only converts numbers from strings to Integers. Error with string \"" + str + "\"");

        }

        // for failed attempts, return null
        return null;
    }

}
