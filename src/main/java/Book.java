import lombok.*;

@NoArgsConstructor
@Getter
public class Book {

    private Long idBook;
    private String title;
    private String author;
    private int publishYear;
    private boolean isRent;

    public Book(Long idBook, String title, String author, int publishYear){
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }
}
