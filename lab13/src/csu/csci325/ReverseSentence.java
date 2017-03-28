package csu.csci325;

import java.util.Scanner;

/**
 * Created by Matthew on 11/4/2015.
 */

public class ReverseSentence {

    // Takes a string and returns another string with the values of the string reversed
    /* DPW: While this works, the instruction say you MUST use a stack. -50) */
    public static String ReverseWord(String word){
        String tempString = "";
        for(int i = 1; i <= word.length(); i++){
            tempString += word.charAt(word.length() - i); // set the next char in the new string to be from the back of the old string
        }
        return tempString;
    }




    public static void main(String args[]){
        List list;
        list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter in words to reverse: "); // get the words
        while(scan.hasNext()){ // while there are more words...
            String temp = scan.next(); // set a string equal to the next word
            list.add(temp); // add that string to the end of the list
        }

        for (int i = 0; i < list.size(); i++){
            System.out.print(ReverseWord((String)list.get(i)) + " ");

        }
    }




}
