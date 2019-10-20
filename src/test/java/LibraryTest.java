import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        // given
        Book book = new Book(1L, "Przykład 1", "Autor 1");
        Library library = new Library();

        // when
        library.addBook(book);

        // then
        assertEquals(1, library.getListBook().size());
    }

    @Test
    public void testAddClient() {
        // given
        Client client = new Client("Adrian", "Biernacki", 1L, "555555555");
        Library library = new Library();

        // when
        library.addClient(client);

        // then
        assertEquals(1, library.getListClient().size());
    }

    @Test
    public void testRemoveBook() {
        // given
        Book book = new Book(1L, "Przykład 1", "Autor 1");
        Library library = new Library();

        // when
        library.addBook(book);
        library.removeBook(book);

        // then
        assertEquals(0, library.getListBook().size());
    }

    @Test
    public void removeClient(){
        // given
        Client client = new Client("Jan", "Kowalski", 1L, "123-456-789");
        Library library = new Library();

        // when
        library.addClient(client);
        library.removeClient(client);

        // then
        assertEquals(0, library.getListClient().size());
    }
}