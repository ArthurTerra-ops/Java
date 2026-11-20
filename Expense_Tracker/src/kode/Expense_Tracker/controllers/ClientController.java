package kode.Expense_Tracker.controllers;

import kode.Expense_Tracker.models.Client;
import kode.Expense_Tracker.models.ClientDAO;

import java.util.List;

public class ClientController {
    // Here the DAO is executed using its internal functions and collecting the class Client's info
    private ClientDAO clientDAO = new ClientDAO();

    public  void createClient(String name, String passWord, String login) {
        clientDAO.create(name,passWord, login);
    }

    public  void updateClient(int id, String name, String passWord, String login) {
        clientDAO.update(id, name,passWord, login);

    }

    public  void deleteClient(int id) {
        clientDAO.delete(id);
    }

    public List<Client> listClients() {
        return clientDAO.viewAll();
    }

    public Client getClientById(int id) {
        Client client = clientDAO.searchById(id);
        return client;}

}
