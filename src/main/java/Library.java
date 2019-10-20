import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter

public class Library {

    private List<Book> listBook = new ArrayList<>();
    private List<Client> listClient = new ArrayList<>();
    private List<Rental> listRental = new ArrayList<>();


    public void addBook(Book book) {
        Optional<Book> findBook = listBook.stream()
                .filter(a -> a.getIdBook().equals(book.getIdBook()))
                .findAny();
        if (!findBook.isPresent()) {
            listBook.add(book);
        } else {
            System.out.println("Taka książka już istnieje!");
        }
    }

    public void addClient(Client client) {
        Optional<Client> findClient = listClient.stream()
                .filter(a -> a.getIdClient().equals(client.getIdClient()))
                .findAny();
        if (!findClient.isPresent()) {
            listClient.add(client);
        } else {
            System.out.println("Taki klient już istnieje!");
        }
    }

    public void removeBook(Book book) {
        Optional<Book> bookExist = listBook.stream()
                .filter(a -> a.getIdBook().equals(book.getIdBook()))
                .findAny();
        if (!bookExist.isPresent()) {
            throw new IllegalArgumentException();
        } else {
            listBook.remove(bookExist.get());
        }
    }

    public void removeClient(Client client) {
        Optional<Client> clientExist = listClient.stream()
                .filter(a -> a.getIdClient().equals(client.getIdClient()))
                .findAny();
        if (!clientExist.isPresent()) {
            throw new IllegalArgumentException();
        } else {
            listClient.remove(clientExist.get());
        }
    }

    public void searchByTitle(Book book) {
        List<Book> collect = listBook.stream()
                .filter(a -> a.getTitle().equals(book.getTitle()))
                .collect(Collectors.toList());
        if (collect.size() > 0) {
            System.out.println("W bibliotece jest książka o podanym tytule.");
        }
    }


}

