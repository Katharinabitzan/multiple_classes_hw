import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Book book;
    private Student student;
    private Library library;

    @Before
    public void before(){
        book = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
        student = new Student();
        library = new Library(20);
    }

    @Test
    public void studentCanBorrowBook(){
        library.addBook(book);
        student.borrowBook(library, book);
        assertEquals(1, student.borrowedBooksCount());
        assertEquals(0, library.numberOfBooks());
    }
}
