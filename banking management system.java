BankingManagementSystem class: This class could be your main class to interact with the system.
public class BankingManagementSystem {
    public static void main(String[] args) {
        // Initialize the bank and create accounts
        Bank bank = new Bank();
        Account account1 = new Account(1, "Account Holder 1", 1000);
        Account account2 = new Account(2, "Account Holder 2", 1500);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Implement the user interface and interaction here.
    }
}
