import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

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

    @Test
    public void testAddRental() throws ParseException {

        //given
        Client client = new Client("Adrian","Biernacki",1L,"555555555");
        Book book = new Book(1L,"Janko Muzykant","Jan Brzechwa");
        Rental rental = new Rental(book,client,simpleDateFormat.parse("1999-10-03"),simpleDateFormat.parse("1999-10-17"));
        Library library = new Library();

        //when
        library.addRental(rental);

        //then
        assertEquals(1,library.getListRental().size());
    }

    @Test
    public void testAddRentalTheSameName() throws ParseException {

        //given
        Client client = new Client("Adrian","Biernacki",1L,"555555555");
        Book book = new Book(1L,"Janko Muzykant","Jan Brzechwa");
        Rental rental1 = new Rental(book,client,simpleDateFormat.parse("1999-10-03"),simpleDateFormat.parse("1999-10-17"));
        Rental rental2 = new Rental(book,client,simpleDateFormat.parse("1999-09-03"),simpleDateFormat.parse("1999-09-17"));
        Library library = new Library();

        //when
        library.addRental(rental1);
        library.addRental(rental2);

        //then
        assertEquals(2,library.getListRental().size());
    }

    @Test
    public void testAddRentalTheSameRenta() throws ParseException {

        //given
        Client client = new Client("Adrian","Biernacki",1L,"555555555");
        Book book = new Book(1L,"Janko Muzykant","Jan Brzechwa");
        Rental rental1 = new Rental(book,client,simpleDateFormat.parse("1999-10-03"),simpleDateFormat.parse("1999-10-17"));
        Rental rental2 = new Rental(book,client,simpleDateFormat.parse("1999-10-03"),simpleDateFormat.parse("1999-10-17"));
        Library library = new Library();

        //when
        library.addRental(rental1);
        library.addRental(rental2);

        //then
        assertEquals(1,library.getListRental().size());
    }
}