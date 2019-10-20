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

        //given
        Client client = new Client("Adrian", "Biernacki", 1L, "555555555");
        Library library = new Library();

        //when
        library.addClient(client);

        //then
        assertEquals(1, library.getListClient().size());

    }
}