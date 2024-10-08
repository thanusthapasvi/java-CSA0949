import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = new int[4];
        int[] notes = new int[4];
        int totalBalance = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "st Denomination: ");
            denominations[i] = scanner.nextInt();
            System.out.print("Enter the number of notes for " + denominations[i] + ": ");
            notes[i] = scanner.nextInt();
            totalBalance += denominations[i] * notes[i];
        }
        System.out.println("Total Available Balance in ATM: " + totalBalance);
        scanner.close();
    }
}
