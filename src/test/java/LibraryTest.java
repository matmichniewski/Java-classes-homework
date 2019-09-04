import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Books book;
    Borrower borrower;

    @Before
    public void setUp(){
        library = new Library(3);
        book = new Books("Godfather", "Mario Puzo", "Crime");
        borrower = new Borrower();
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToTheLibraryStock(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkIfStockIsFull(){
        assertEquals(true, library.stockIsFull());
    }

    @Test
    public void dontAddBookIfFullStock(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.bookCount());
    }









}
