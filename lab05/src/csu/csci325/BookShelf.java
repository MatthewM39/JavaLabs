package csu.csci325;

/**
 * Created by pwest on 9/15/15.
 * Modified by Matthew McCrackin on 9/2//15.
 */

public class BookShelf {

    private Book book1, book2, book3, book4, book5;

    // constructor for the BookShelf. Sets all books to null as default.
    public BookShelf() {
      book1 = null;
      book2 = null;
      book3 = null;
      book4 = null;
      book5 = null;
    }

    //Set book at index num to b;
    public void setBook(int num, Book b) {
        switch(num){
            case 0: book1 = b;
                    break;
            case 1: book2 = b;
                    break;
            case 2: book3 = b;
                    break;
            case 3: book4 = b;
                    break;
            case 4: book5 = b;
                    break;
            default: System.out.println("You need to enter in an index between 0 and 4. The bookshelf only has five slots.");
        }
    }

    // Counts the number of books
    public int numBooks() {
        int count = 0;
        int books = 0;

        // Loop through the books and sees if each book is null
        while (count < 5){
            if ( getBook(count) != null){
                books++;
            }
            count++;
        }
        return books;
    }

    // return the book with the specified index
    public Book getBook(int num){
        switch(num){
            case 0: return book1;
            case 1: return book2;
            case 2: return book3;
            case 3: return book4;
            case 4: return book5;
            default: return null;
        }
    }
}
