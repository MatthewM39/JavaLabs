package csu.csci325;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pwest on 9/15/15.
 */
public class BookTest {

    @Test
    public void testSetTitle() throws Exception {
        Book book = new Book("Romans", "Paul", "", "");
        book.setTitle("Romanss");
        assertTrue(book.getTitle().equals("Romanss"));
    }

    @Test
    public void testSetAuthor() throws Exception {
        Book book = new Book("Romans", "Paul", "", "");
        book.setTitle("Romanss");
        assertTrue(book.getAuthor().equals("Paul"));
    }
}