import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testAddBook(){
        // given
        List<Book> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(new Book(1L, "Przykład 1", "Autor 1"));
        listaKsiazek.add(new Book(2L, "Przykład 2", "Autor 2"));
        listaKsiazek.add(new Book(3L, "Przykład 3", "Autor 3"));
        Library library = new Library();

        // when

        // then
        assertEquals(3, listaKsiazek.size());

    }

}