package lab2.ex7;

public class BankAccount implements IBankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Нельзя внести отрицательную сумму.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else if (amount <= 0) {
            System.out.println("Нельзя снять отрицательную сумму.");
        } else {
            System.out.println("Недостаточно средств.");
        }
    }

    @Override
    public double balance() {
        return balance;
    }
}
