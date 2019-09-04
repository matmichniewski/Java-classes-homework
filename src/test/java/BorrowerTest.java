import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Books book;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Books("Godfather", "Mario Puzo", "Crime");
        library = new Library(3);
    }

    @Test
    public void hasBooks(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book);
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());
    }

}
