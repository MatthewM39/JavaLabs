package com.company;

import java.util.Scanner;

/**
 * Created by Matthew on 10/7/2015.
 */
public class Question{

    private String mQuestion = null, mInstructorsAnswer, mUserAnswer;
    Scanner scan = new Scanner(System.in);

    public Question (String question, String instructorsAnswer){
        mQuestion = question;
        mInstructorsAnswer = instructorsAnswer;
    }

    // Ask the question and get the user answer
    public void askQuestion(){
        System.out.print(mQuestion + " ");
        mUserAnswer = scan.nextLine();
    }

    // compare instructor's answer and the user. return true if same.
    public boolean isAnswerCorrect(){
        if(mUserAnswer.equals(mInstructorsAnswer)){
            return true;
        }
        return false;
    }

    // print the question, student response, and instructor's answer
    public void print(){
        System.out.println(mQuestion + ", Student response: " + mUserAnswer + ", Instructor's answer: " + mInstructorsAnswer);
    }

    // return the question
    public String getQuestion(){
        return mQuestion;
    }

    // return user answer
    public String getAnswer(){
        return mUserAnswer;
    }

    public void setUserAnswer(String input){
        mUserAnswer = input;
    }


}
