import java.util.Scanner;

public class PerfectSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Invalid input. Enter a non-negative integer.");
            return;
        }

        double sqrt = Math.sqrt(num);
        if (sqrt == Math.floor(sqrt)) {
            System.out.println("Square Root: " + (int)sqrt + ", -" + (int)sqrt);
        } else {
            System.out.println("The number is not a perfect square.");
        }
    }
}
