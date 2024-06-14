package BankingProject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean authenticate(String accountNumber, String pin) {
        Account account = accounts.get(accountNumber);
        return account != null && account.validatePin(pin);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public boolean withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful. New balance: " + account.getBalance());
                return true;
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
        return false;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create some sample accounts
        bank.addAccount(new Account("123456", "1234", 1000));
        bank.addAccount(new Account("789012", "5678", 500));

        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        String currentAccount = null;

        while (!loggedIn) {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter PIN: ");
            String pin = scanner.nextLine();

            if (bank.authenticate(accountNumber, pin)) {
                loggedIn = true;
                currentAccount = accountNumber;
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid account number or PIN. Please try again.");
            }
        }

        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(currentAccount, depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(currentAccount, withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + bank.getAccount(currentAccount).getBalance());
                    break;
                case 4:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
