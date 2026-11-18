package kode.Expense_Tracker.models;


import java.util.List;

public class ExpenseDAO  {
    // Stores Expense's possible actions considering they are stored here - can - search, add, delete, update
    //CRUD Specific
    public Expense create() {};
    public List<Expense> viewAll() {};

    public int Update() {};
    public int Delete() {};

    //Expense Specific
    public Expense searchById(int id) {};
    public int sumary() {};
    public String sumaryByMonth() {};
    public int sumaryAll() {};
}
