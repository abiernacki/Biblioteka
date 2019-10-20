import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class RentalTest {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    public void RentalTest() throws ParseException {

        //given
        Client client = new Client("Adrian","Biernacki",1L,"555555555");
        Book book = new Book(1L,"Janko Muzykant","Jan Brzechwa",2019);
        Rental rental = new Rental(book,client,simpleDateFormat.parse("1999-10-03"),simpleDateFormat.parse("1999-10-17"));

        //when

        //then
        assertEquals("Adrian",rental.getClient().getFirstName());
        assertEquals("Biernacki",rental.getClient().getLastName());
        assertEquals(1L,rental.getClient().getIdClient().longValue());
        assertEquals("555555555",rental.getClient().getPhoneNumber());
        assertEquals(1L,rental.getBook().getIdBook().longValue());
        assertEquals("Janko Muzykant",rental.getBook().getTitle());
        assertEquals("Jan Brzechwa",rental.getBook().getAuthor());
        assertEquals("1999-10-03",simpleDateFormat.format(rental.getDateFrom()));
        assertEquals("1999-10-17",simpleDateFormat.format(rental.getDateTo()));



    }

}