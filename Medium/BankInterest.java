import java.util.Scanner;

class Bank {
    public void getInterestRate(String bankName, double rate) {
        System.out.println(bankName + ": " + rate + "%");
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter bank name and rate (e.g., SBI, 8.4): ");
        String input = sc.nextLine();
        String[] parts = input.split(",");
        String bankName = parts[0];
        double rate = Double.parseDouble(parts[1]);

        bank.getInterestRate(bankName, rate);
    }
}
