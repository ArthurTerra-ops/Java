package kode.Expense_Tracker.controllers;

import kode.Expense_Tracker.models.Client;
import kode.Expense_Tracker.models.ClientDAO;
import kode.Expense_Tracker.models.Expense;
import kode.Expense_Tracker.models.ExpenseDAO;

import java.util.List;

public class ExpenseController {
    // Here the DAO is executed using its internal functions and collecting the class Expense's info

    private ExpenseDAO expenseDAO = new ExpenseDAO();

    public void createExpense() {};
    public void updateExpense() {};
    public void deleteExpense() {};

    public List<Expense> listExpenses() {return  expenseDAO.viewAll();}
    public Expense getExpense(int id) {return expenseDAO.searchById(id);}
}
