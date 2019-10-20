import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Book {

    private Long idBook;
    private String title;
    private String author;

    private boolean isRent;

    public void setRent(boolean rent) {
        isRent = rent;
    }
}
