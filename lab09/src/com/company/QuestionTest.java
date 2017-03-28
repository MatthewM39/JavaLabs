package com.company;

import junit.framework.TestCase;

/**
 * Created by Matthew on 10/8/2015.
 */
public class QuestionTest extends TestCase {




    Question myQuestion = new Question("What dog is the best", "corgi");


    public void testIsAnswerCorrect() throws Exception {
        myQuestion.setUserAnswer("corgi");
        assertTrue(myQuestion.isAnswerCorrect() == true);
        myQuestion.setUserAnswer("cat");
        assertTrue(myQuestion.isAnswerCorrect() == false);
    }


    public void testPrint() throws Exception {
        myQuestion.setUserAnswer("corgi");
        myQuestion.print();
    }

    public void testGetQuestion() throws Exception {
        assertTrue(myQuestion.getQuestion().equals("What dog is the best"));
    }
}