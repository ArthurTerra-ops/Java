import kode.Expense_Tracker.controllers.ClientController;
import kode.Expense_Tracker.controllers.ExpenseController;
import kode.Expense_Tracker.models.Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ClientController clientController = new ClientController();
    ExpenseController expenseController = new ExpenseController();
int option = 0;
Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("--------------------------------------------------\nAdmin access panel\n--------------------------------------------------");
        System.out.println("Insert numbers between 1 and 6 to interact\n Press: 1: Create new client\n Press: 2: List All Clients\n Press: 3: Update Client");
        System.out.println("Press: 4: Delete Client\n Press: 5: Get specific CLient\n Press: 6: Go Back\n");
        option = scanner.nextInt();

        switch (option){
            case 1: System.out.println("Enter a name: \n"); String name = scanner.next(); System.out.println("Enter a passWord: \n"); String passWord = scanner.next(); System.out.println("Enter a login: \n"); String login = scanner.next(); clientController.createClient(name, passWord, login);  break;
            case 2: System.out.println("All clients registered bellow:\n"); System.out.println(clientController.listClients());  break;
            case 3: System.out.println("Enter client ID: \n"); int id = scanner.nextInt(); System.out.println("Enter a name: \n"); String newname = scanner.next(); System.out.println("Enter a passWord: \n"); String newpassWord = scanner.next(); System.out.println("Enter a login: \n"); String newlogin = scanner.next(); clientController.updateClient(id, newname, newpassWord, newlogin); break;
            case 4: System.out.println("Enter client ID: \n"); id = scanner.nextInt(); clientController.deleteClient(id); break;
            case 5: System.out.println("Enter client ID: \n"); id = scanner.nextInt();System.out.println(clientController.getClientById(id)); break;
            case 6: System.out.println("Go Back"); break;
            default:
                System.out.println("Number out of range,\n please select between 1-6");


        }
    }
    while (option != 6);


    do {
        System.out.println("--------------------------------------------------\nAdmin access panel\n--------------------------------------------------");
        System.out.println("Insert numbers between 1 and 6 to interact\n Press: 1: Create new Expense\n Press: 2: List All Expenses\n Press: 3: Update Expense");
        System.out.println("Press: 4: Delete Expense\n Press: 5: Get specific Expense\n Press: 6: Go Back\n");
        option = scanner.nextInt();

        switch (option){
            case 1: System.out.println("Enter a description: \n"); String description = scanner.next(); System.out.println("Enter a value: \n"); int value = scanner.nextInt(); expenseController.createExpense(description, value);  break;
            case 2: System.out.println("All expenses registered bellow:\n"); System.out.println(expenseController.listExpenses());  break;
            case 3: System.out.println("Enter expense ID: \n"); int id = scanner.nextInt(); System.out.println("Enter a description: \n"); String newdescription = scanner.next(); System.out.println("Enter a value: \n"); int newvalue = scanner.nextInt(); expenseController.updateExpense(id, newdescription, newvalue); break;
            case 4: System.out.println("Enter expense ID: \n"); id = scanner.nextInt(); expenseController.deleteExpense(id); break;
            case 5: System.out.println("Enter expense ID: \n"); id = scanner.nextInt();System.out.println(expenseController.getExpense(id)); break;
            case 6: System.out.println("Go Back"); break;
            default:
                System.out.println("Number out of range,\n please select between 1-6");


        }
    }
    while (option != 6);
}
