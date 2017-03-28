package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Quiz myQuiz = new Quiz();
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        String ques, ans;

        System.out.println("You may begin entering in questions and answers. To stop entering questions, simply press enter in the question field ");

        // while the counter is below 25, ask for questions
        while(counter < 25){

            // get the question
            System.out.print(counter + 1 + ". Enter a question: ");
            ques = scan.nextLine();

            // if the input is anything but blank, do this
            if(! ques.equals("")) {
                boolean isAnswered = false;
                while (!isAnswered) {
                    System.out.print(counter + 1 + ". Enter the answer : "); // get the answer to the question
                    ans = scan.nextLine();
                    myQuiz.setQuestion(counter, new Question(ques, ans)); // set the question using the question and answer

                  // a blank answer must be inputted again
                    if(! ans.equals("")){
                        isAnswered = true;
                    }
                    else{
                        System.out.println("Enter in an answer for the question!");
                    }
                }
            }
            else{
                counter = 25; // blank question input sets the counter to 25 and terminates asking questions
            }
            counter++;
        }

        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"); // blankspaces to prevent cheating :)
        myQuiz.giveQuiz(); // give the quiz
        myQuiz.printResults(); // print the results
    }
}
