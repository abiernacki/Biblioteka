import org.junit.Test;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> origin/master
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
<<<<<<< HEAD
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

=======
    public void testAddClient() {

        //given
        Client client = new Client("Adrian","Biernacki",1L,"555555555");
        Library library = new Library();

        //when
        library.addClient(client);

        //then
        assertEquals(1,library.getListClient().size());
>>>>>>> origin/master
    }

}