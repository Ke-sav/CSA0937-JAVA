Bank class: This class would represent the bank itself.
public class Bank {
    private ArrayList<Account> accounts;

      public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
