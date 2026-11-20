package kode.Expense_Tracker.models;


import java.util.ArrayList;
import java.util.List;

public class ExpenseDAO  {
    // Stores Expense's possible actions considering they are stored here - can - search, add, delete, update
    //CRUD Specific

    private final List<Expense> DataBase = new ArrayList<>();

    public Expense create(String description, int value) {
        Expense expense = new Expense(description, value);
        DataBase.add(expense);
        expense.setId(DataBase.size());
        return expense;
    };
    public List<Expense> viewAll() {return DataBase;};
    public Expense searchById(int id) {Expense expense = DataBase.stream().filter( expense1 -> expense1.getId() == id).findFirst().get();
        return expense;};

    public Expense update(int id, String description, int value) {
        Expense expense = searchById(id);
    expense.setDecription(description);
    expense.setValue(value);

    return expense;}

    public void delete(int id) {
        DataBase.remove(searchById(id));
    };

    //Expense Specific
    //public int sumary() {};
    //public String sumaryByMonth() {};
    //public int sumaryAll() {};
}
