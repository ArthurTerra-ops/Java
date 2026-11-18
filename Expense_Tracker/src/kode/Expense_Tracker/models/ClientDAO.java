package kode.Expense_Tracker.models;


import java.util.List;

public class ClientDAO  {
    // Stores Client's possible actions considering they are stored here - can - search, add, delete, update
    //CRUD Specific
    public Client create() {};
    public int Update() {};
    public int Delete() {};
    public List<Client> viewAll() {};
    public Client searchById(int id) {};
}
