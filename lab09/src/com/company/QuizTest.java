package com.company;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;

/**
 * Created by Matthew on 10/8/2015.
 */
public class QuizTest extends TestCase {

    Quiz myQuiz = new Quiz();
    ByteArrayInputStream in = new ByteArrayInputStream("corgi".getBytes());

    public void testSetQuestion() throws Exception {
        myQuiz.setQuestion(0, new Question("What is the best dog?", "The corgi"));
        assertTrue(myQuiz.getQuestion(0).getQuestion().equals("What is the best dog?"));
    }
}