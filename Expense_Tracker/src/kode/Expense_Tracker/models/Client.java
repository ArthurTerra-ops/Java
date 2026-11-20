package kode.Expense_Tracker.models;

public class Client {
    // Here the basic client is created

    private String name;
    private String passWord;
    private String login;

    private int id;
    private int budget;

    public Client(String name, String passWord, String login) {
        this.name = name;
        this.passWord = passWord;
        this.login = login;
    }

    @Override
    public String toString() {
    return "{ name: " + name + "\n id: " + id + "\n Login: " + login + " }";
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
