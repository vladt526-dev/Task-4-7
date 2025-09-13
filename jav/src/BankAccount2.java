public class BankAccount2 {
    private final String owner;
    private double balance;

    public BankAccount2(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + " поклав " + amount + " грн. Новий баланс: " + balance);

        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(owner + " зняв " + amount + " грн. Новий баланс: " + balance);
        } else {
            System.out.println(owner + " не може зняти " + amount + " грн. Недостатньо грошей");
        }
    }

    public void getBalance() {
        System.out.println("Баланс власника " + owner + ": " + balance);
    }
}

