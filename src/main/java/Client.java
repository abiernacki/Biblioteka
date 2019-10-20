import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Client {

    private String firstName;
    private String lastName;
    private Long idClient;
    private String phoneNumber;
}
