package lab2.ex7;

public interface IBankAccount {
    void deposit(double amount);

    void withdraw(double amount);

    double balance();

    static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        System.out.println(account.balance());

        account.withdraw(200);
        System.out.println(account.balance());
    }
}
