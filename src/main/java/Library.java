import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class Library {

    private List<Book> listBooks = new ArrayList<>();
    private List<Client> listClient = new ArrayList<>();
    private List<Rental> listRental = new ArrayList<>();

    public void addClient(Client client){
        Optional<Client> findClient = listClient.stream()
                .filter(a -> a.getIdClient().equals(client.getIdClient()))
                .findAny();
        if (!findClient.isPresent()){
            listClient.add(client);
        } else {
            System.out.println("Taki klient już istnieje!");
        }
    }


}

