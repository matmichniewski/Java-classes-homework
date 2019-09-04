import java.util.ArrayList;

public class Borrower {

    private ArrayList<Books> collection;

    public Borrower(){
        this.collection = new ArrayList<Books>();
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Books book = library.rentBook();
        this.collection.add(book);
    }
}
