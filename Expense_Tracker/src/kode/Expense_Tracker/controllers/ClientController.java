package kode.Expense_Tracker.controllers;

import kode.Expense_Tracker.models.Client;
import kode.Expense_Tracker.models.ClientDAO;

import java.util.List;

public class ClientController {
    // Here the DAO is executed using its internal functions and collecting the class Client's info
    private ClientDAO clientDAO = new ClientDAO();

    public void createClient() {}
    public void updateClient() {}
    public void deleteClient() {}
    public List<Client> listClients() {return  clientDAO.viewAll();}
    public Client getClient(int id) {return clientDAO.searchById(id);}

}
