import java.util.Scanner;

public class NthOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. N must be a positive integer.");
            return;
        }

        System.out.print("Odd numbers are: ");
        for (int i = 1; i <= 2 * n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
