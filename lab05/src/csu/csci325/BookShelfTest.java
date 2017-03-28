package csu.csci325;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pwest on 9/15/15.
 * Modified by Matthew McCrackin on 9/22/15.
 */

public class BookShelfTest {

    // tests setBook() and getBook() by creating a new book and making sure the values are correct.
    @Test
    public void testSetBook() throws Exception{
        BookShelf bookshelf = new BookShelf();
        bookshelf.setBook(0, new Book("Romans", "Paul", "CSU Publishing", 2015));

        assertTrue(bookshelf.getBook(0).getTitle().equals("Romans"));
        assertTrue(bookshelf.getBook(0).getCopyrightDate() == 2015);
        assertTrue(bookshelf.getBook(0).getPublisher().equals("CSU Publishing"));
        assertTrue(bookshelf.getBook(0).getAuthor().equals("Paul"));

    }

    // tests numBooks() by creating two books and using numBooks() to confirm there are two books.
    @Test
    public void testNumBooks() throws Exception {
        BookShelf bookshelf = new BookShelf();

        bookshelf.setBook(0, new Book("Romans", "Paul", "CSU Publishing", 2015));
        bookshelf.setBook(3, new Book("Romans", "Paul", "CSU Publishing", 2015));

        assertTrue(bookshelf.numBooks() == 2);

    }

    // makes sure the Book class is used properly by BookShelf
    @Test
    public void testBookClass() throws Exception{

        // create a new bookshelf
        BookShelf bookshelf = new BookShelf();
        bookshelf.setBook(0, new Book("Dogs", "Me", "Paper", 2010));

        // change values of a book in the bookshelf
        bookshelf.getBook(0).setCopyrightDate(2015);
        bookshelf.getBook(0).setAuthor("Matthew");
        bookshelf.getBook(0).setTitle("Corgis");
        bookshelf.getBook(0).setPublisher("Publishing Company");

        // confirm the value changes
        assertTrue(bookshelf.getBook(0).getAuthor().equals("Matthew"));
        assertTrue(bookshelf.getBook(0).getPublisher().equals("Publishing Company"));
        assertTrue(bookshelf.getBook(0).getTitle().equals("Corgis"));
        assertTrue(bookshelf.getBook(0).getCopyrightDate() == 2015);
    }

    // makes sure that there are no books
    @Test
    public void testEmptyBooks() throws Exception{
        BookShelf bookshelf = new BookShelf();

        assertTrue(bookshelf.numBooks() == 0);

    }

    // makes sure that the bookshelf is full
    @Test
    public void testFullBooks() throws Exception{
        BookShelf bookshelf = new BookShelf();

        // fill the bookshelf with generic books
        for (int i = 0; i<5; i++){
            bookshelf.setBook(i, new Book("Romans", "Paul", "CSU Publishing", i));
        }

        // confirms there are five books
        assertTrue(bookshelf.numBooks() == 5);

        // checks that the titles were properly set for each book
        for (int i = 0; i<5; i++){
            assertTrue(bookshelf.getBook(1).getTitle().equals("Romans"));
        }

    }







}