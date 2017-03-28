package csu.csci325;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pwest on 9/15/15.
 */
public class BookShelfTest {

    @Test
    public void testNumBooks() throws Exception {
        BookShelf bookshelf = new BookShelf();

        bookshelf.setBook(0, new Book("Romans", "Paul", "", ""));

        assertTrue(bookshelf.numBooks() == 1);
    }
}