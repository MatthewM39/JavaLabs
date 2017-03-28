package com.company;

import java.util.Scanner;

/**
 * Created by Matthew on 10/7/2015.
 */
public class Quiz {

    private final int LIMIT = 25;  // max amount of questions
    Question[] myQuestions = new Question[LIMIT];
    private int counter = LIMIT; // amount of questions, defaults to 25
    private int score = 0;

    // this function sets the question in the array
    public void setQuestion(int index, Question q){
        myQuestions[index] = q;
    }

    // gives the quiz. blank questions are skipped.. if a question is blank, decrement counter so that the total questions is lowered
    public void giveQuiz(){
        for (int i = 0; i < LIMIT; i++){
            if(myQuestions[i] != null){
                myQuestions[i].askQuestion();
            }
            else{
                counter--;
            }
        }
    }

    // prints the result of the quiz by counting the correct answers
    public void printResults(){
        for (int i = 0; i < LIMIT; i++){
            if(myQuestions[i] != null){
                myQuestions[i].print();
                if (myQuestions[i].isAnswerCorrect() == true){
                    score++;
                }
            }
        }
        if(counter > 0){
        System.out.println("Auto-grader: " + score + " out of " + counter);
        }
        else{
            System.out.println("THIS QUIZ HAS NO QUESTIONS GOOD JOB"); // a quiz with no questions isn't a quiz
        }
    }

    public Question getQuestion(int idx){
        return myQuestions[idx];
    }
}
