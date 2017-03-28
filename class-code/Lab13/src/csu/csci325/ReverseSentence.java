package csu.csci325;

import java.util.Scanner;

/**
 * Created by pwest on 10/29/15.
 */
public class ReverseSentence {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            String word = s.next();
            System.out.println(ReverseWord(word));
        }
    }

    public static String ReverseWord(String word) {
        return word;
    }
}
