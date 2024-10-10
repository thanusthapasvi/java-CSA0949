import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be printed: ");
        int number = sc.nextInt();

        System.out.print("Max Number of time printed: ");
        int max = sc.nextInt();

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }

        for (int i = max - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
