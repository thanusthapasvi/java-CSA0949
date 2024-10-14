import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countPositive = 0, countNegative = 0;
        int sumPositive = 0, sumNegative = 0;
        int number;

        System.out.println("Enter -1 to exit...");
        while (true) {
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            if (number == -1) {
                break;
            } else if (number > 0) {
                sumPositive += number;
                countPositive++;
            } else if (number < 0) {
                sumNegative += number;
                countNegative++;
            }
        }

        if (countNegative > 0)
            System.out.println("The average of negative numbers is: " + (double) sumNegative / countNegative);
        else
            System.out.println("No negative numbers were entered.");

        if (countPositive > 0)
            System.out.println("The average of positive numbers is : " + (double) sumPositive / countPositive);
        else
            System.out.println("No positive numbers were entered.");
    }
}
