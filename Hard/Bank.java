package Hard;

import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String depositorName, int accountNumber, String accountType) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 10000;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount < 500) {
            System.out.println("Insufficient balance! Minimum balance must be Rs.500.00");
        } else {
            balance -= amount;
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter depositor name: ");
        String depositorName = sc.nextLine();
        System.out.print("Enter account type (Savings/Current): ");
        String accountType = sc.nextLine();

        BankAccount account = new BankAccount(depositorName, accountNumber, accountType);

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);

        account.displayBalance();
    }
}

