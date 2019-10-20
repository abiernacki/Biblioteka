import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testAddClient() {

        //given
        Client client = new Client("Adrian","Biernacki",1L,"555555555");
        Library library = new Library();

        //when
        library.addClient(client);

        //then
        assertEquals(1,library.getListClient().size());
    }

}