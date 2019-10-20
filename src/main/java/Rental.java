import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Rental {

    private Book book;
    private Client client;
    private Date dateTo;
    private Date dateFrom;
}
