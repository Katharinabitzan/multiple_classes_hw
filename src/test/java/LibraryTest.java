import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

   private  Book book;
   private Library library;
   private Library smallLibrary;

    @Before
    public void before(){
        book = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
        library = new Library(100);
        smallLibrary = new Library(2);
    }

    @Test
    public void libraryHasCapcity(){
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void libraryCanCountBooks(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void cantAddBookToFullLibrary(){
        smallLibrary.addBook(book);
        smallLibrary.addBook(book);
        smallLibrary.addBook(book);
        assertEquals(2, smallLibrary.numberOfBooks());
    }

    @Test
    public void canRemoveSelectedBook(){
        library.addBook(book);
        library.removeSelectedBook(book);
        assertEquals(0, library.numberOfBooks());
    }
}
