import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                System.out.println("The factorial of " + n + " is: " + factorial(n));
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
