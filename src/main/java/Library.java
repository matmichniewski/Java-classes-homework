import java.util.ArrayList;

public class Library {

    private ArrayList<Books> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Books>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Books book) {
        if (this.capacity > this.bookCount()){
            this.books.add(book);
        }
    }

    public boolean stockIsFull() {
        if (this.capacity >= 3){
        }
        return true;
    }


    public Books rentBook() {
        return this.books.remove(0);
    }
}
