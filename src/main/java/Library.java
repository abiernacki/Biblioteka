import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter

public class Library {

    private List<Book> listBook = new ArrayList<>();
    private List<Client> listClient = new ArrayList<>();
    private List<Rental> listRental = new ArrayList<>();

    public void addBook(Book book){
        Optional<Book> findBook = listBook.stream()
                .filter(a -> a.getIdBook().equals(book.getIdBook()))
                .findAny();
        if (!findBook.isPresent()){
            listBook.add(book);
        } else {
            System.out.println("Taka książka już istnieje!");
        }
    }

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

