
public class Main {
    public static void main(String[] args) {
        BankAccount2 acc = new BankAccount2("Барига колобок ", 100);

        acc.deposit(50);
        acc.withdraw(30);
        acc.withdraw(200);
        acc.getBalance();
    }
}