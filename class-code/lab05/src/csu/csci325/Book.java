package csu.csci325;

/**
 * Created by pwest on 9/15/15.
 */
public class Book {
    private String mTitle, mAuthor;

    public Book(String title, String author, Object publisher, Object copyrightDate) {
        mTitle = title;
        this.mAuthor = author;
        // What about publisher and copyrightDate???
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }
}
