package Codsoft;
import java.util.*;

public class ATM {

        private BankAccount account;

        public ATM(BankAccount account) {
            this.account = account;
        }

        public void displayMenu() {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
        }

        public void checkBalance() {
            System.out.printf("Current balance: $%.2f%n", account.getBalance());
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid deposit amount.");
            } else {
                account.deposit(amount);
                System.out.printf("Successfully deposited $%.2f%n", amount);
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            } else if (account.withdraw(amount)) {
                System.out.printf("Successfully withdrew $%.2f%n", amount);
            } else {
                System.out.println("Insufficient balance for this withdrawal.");
            }
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                displayMenu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
                System.out.println();
            }

            scanner.close();
        }
    }

