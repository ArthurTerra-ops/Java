  package kode.Expense_Tracker.controllers;

  import kode.Expense_Tracker.models.Expense;
  import kode.Expense_Tracker.models.ExpenseDAO;

  import java.util.List;

    public class ExpenseController {
    // Here the DAO is executed using its internal functions and collecting the class Expense's info

    private ExpenseDAO expenseDAO = new ExpenseDAO();

    public void createExpense(String description, int value) {expenseDAO.create(description, value);};
    public void updateExpense(int id, String description, int value) {expenseDAO.update(id,  description, value);};
    public void deleteExpense(int id) {expenseDAO.delete(id);};

    public List<Expense> listExpenses() {return  expenseDAO.viewAll();}
    public Expense getExpense(int id) {return expenseDAO.searchById(id);}
}
