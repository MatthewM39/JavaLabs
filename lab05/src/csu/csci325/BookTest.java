package csu.csci325;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pwest on 9/15/15.
 * Modified by Matthew McCrackin on 9/22/15.
 */
public class BookTest {

    // tests setTitle() and getTitle() by setting the title of a book and confirming the title
    @Test
    public void testSetTitle() throws Exception {
        Book book = new Book("Romans", "Paul", "CSU Publishing", 2015);
        book.setTitle("Romanss");
        assertTrue(book.getTitle().equals("Romanss"));
    }

    // tests setAuthor() and getAuthor() by setting and confirming the author of a book
    @Test
    public void testSetAuthor() throws Exception {
        Book book = new Book("Romans", "Paul", "CSU Publishing", 2015);
        book.setAuthor("Romanss");
        assertTrue(book.getAuthor().equals("Romanss"));
    }

    // tests setPublisher() and getPublisher() by setting and confirming the publisher of a book
    @Test
    public void testSetPublisher() throws Exception {
        Book book = new Book("Romans", "Paul", "CSU Publishing", 2015);
        book.setPublisher("Matthew");
        assertTrue(book.getPublisher().equals("Matthew"));
    }

    // tests setCopyRightDate() and getCopyRightDate()by setting and confirming the yearof the book
    @Test
    public void testSetCopyRightDate() throws Exception{
        Book book = new Book("Romans", "Paul", "CSU Publishing", 2015);
        book.setCopyrightDate(2005);
        assertTrue(book.getCopyrightDate() == 2005);
    }





}