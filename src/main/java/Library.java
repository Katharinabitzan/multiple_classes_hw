import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> bookStock;
    private int capacity;

    public Library(int capacity){
        this.bookStock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int numberOfBooks() {
        return this.bookStock.size();
    }

    public void addBook(Book book) {
        if (this.capacity > numberOfBooks()) this.bookStock.add(book);
    }

    public void removeSelectedBook(Book book) {
        if (bookStock.contains(book)) {
            int indexOfBook = bookStock.indexOf(book);
            bookStock.remove(indexOfBook);
        }
    }

//    public void howManyBooksByGenre() {
//        for (1=0; i < bookStock.size(); i++) {
//            bookStock.put()
//        }
//    }
}
