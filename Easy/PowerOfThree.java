import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = sc.next();

        try {
            int num = Integer.parseInt(input);
            if (num < 1) {
                System.out.println("False");
            } else {
                while (num % 3 == 0) {
                    num /= 3;
                }
                System.out.println(num == 1);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }
}
