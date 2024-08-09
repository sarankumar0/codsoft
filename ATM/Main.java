package Codsoft;

public class Main-atm {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500); // Initial balance of $500
        ATM atm = new ATM(account);
        atm.start();
    }
}
