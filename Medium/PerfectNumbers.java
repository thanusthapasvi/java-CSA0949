import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = "); 
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("N should be a positive integer.");
                return;
            }

            System.out.print("First " + n + " perfect numbers are: ");
            int count = 0;
            int number = 1;

            while (count < n) {
                if (isPerfect(number)) {
                    System.out.print(number + (count < n - 1 ? ", " : ""));
                    count++;
                }
                number++;
            }
            System.out.println();
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        scanner.close();
    }
    private static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
