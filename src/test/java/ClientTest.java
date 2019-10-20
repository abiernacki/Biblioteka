import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void testConstructor() {
        // given
        Client client = new Client("Jan", "Kowalski", 1L, "123-456-789");

        // when
        String imie = client.getFirstName();
        String nazwisko = client.getLastName();
        Long idKlient = client.getIdClient();
        String numerTelefonu = client.getPhoneNumber();

        // then
        assertEquals("Jan", imie);
        assertEquals("Kowalski", nazwisko);
        assertEquals(1L, idKlient.longValue());
        assertEquals("123-456-789", numerTelefonu);
    }
}