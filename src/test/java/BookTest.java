import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testConstructor() {
        // given
        Book book = new Book(1L, "Testowa", "Jan Kowalski", 2019);

        // when
        Long idKsiazka = book.getIdBook();
        String tytul = book.getTitle();
        String autor = book.getAuthor();
        int rokWydania = book.getPublishYear();

        // then
        assertEquals(1L, Long.bitCount(idKsiazka));
        assertEquals("Testowa", tytul);
        assertEquals("Jan Kowalski", autor);
        assertEquals(2019, rokWydania);
    }

}