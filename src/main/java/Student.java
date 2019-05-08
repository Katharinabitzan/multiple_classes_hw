import java.util.ArrayList;

public class Student {
    private ArrayList<Book> borrowedBooks;

    public Student() {
        this.borrowedBooks = new ArrayList<>(); }

    public int borrowedBooksCount() {
        return this.borrowedBooks.size();
    }

    public void borrowBook(Library library, Book book) {
        library.removeSelectedBook(book);
        this.borrowedBooks.add(book);

    }


}
