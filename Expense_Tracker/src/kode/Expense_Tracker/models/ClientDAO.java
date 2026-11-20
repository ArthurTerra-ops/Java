package kode.Expense_Tracker.models;


import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;

public class ClientDAO  {
    private final List<Client> DataBase = new ArrayList<>();



    // Stores Client's possible actions considering they are stored here - can - search, add, delete, update
    //CRUD Specific
    public Client create(String name, String password, String login) {
        Client client = new Client(name, password, login);
        DataBase.add(client);
        client.setId(DataBase.size());

        System.out.println(DataBase);
        return client;
    };
    public Client update(int id, String name, String password, String login) {
      Client client = searchById(id);
      client.setName(name);
      client.setLogin(login);
      client.setPassWord(password);
        System.out.println(client);

      return client;
    };
    public void delete(int id) {
        Client client = searchById(id);
        DataBase.remove(client);
        for (int i = 0; i < DataBase.size(); i++) {DataBase.get(i).setId(i);}
        System.out.println("Removed client with id: " + id + "\n DataBase changed each item's id to its index: \n" );
        System.out.println(viewAll());
    };
    public List<Client> viewAll() {
        return DataBase;
    };
    public Client searchById(int id) {
        Client client = DataBase.stream().filter( client1 -> client1.getId() == id).findFirst().get();
        return client;
    };
}
