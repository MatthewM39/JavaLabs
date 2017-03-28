package csu.csci325;

/**
 * Created by pwest on 9/15/15.
 *  Modified by Matthew McCrackin on 9/22/15.
 */


public class Book {
    private String mTitle, mAuthor, mPublisher;
    private int mCopyrightDate;

    // constructor for Book
    public Book(String title, String author, String publisher, int copyrightDate) {
        this.mTitle = title;
        this.mAuthor = author;
        this.mPublisher = publisher;
        this.mCopyrightDate = copyrightDate;
    }

    // gets the title of the book
    public String getTitle() {
        return mTitle;
    }

    // gets the author of the book
    public String getAuthor() {
        return mAuthor;
    }

    // gets the publisher of the book
    public String getPublisher(){
        return mPublisher;
    }

    // gets the copyright date and returns the int
    public int getCopyrightDate(){
        return mCopyrightDate;
    }

    // sets the title
    public void setTitle(String title) {
        mTitle = title;
    }

    // sets the author
    public void setAuthor(String author) {
        mAuthor = author;
    }

    // sets the publisher
    public void setPublisher(String publisher){
        mPublisher = publisher;
    }

    // sets the copyright date
    public void setCopyrightDate(int copyrightDate){
        mCopyrightDate = copyrightDate;
    }
}
