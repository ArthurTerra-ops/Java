package kode.Expense_Tracker.models;

public class Expense {
    // Here the basic Expense is created

    @Override
    public String toString() {
        return "{ Expense: " + decription + "\n id: " + id + "\n Value: " + value + " }";
    };

    public Expense(String decription, int value) {
        this.decription = decription;
        this.value = value;
    }

    private int value;
    private int id;

    private String decription;


    private Client owner;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
