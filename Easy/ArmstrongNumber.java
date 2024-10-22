import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int original = num, result = 0, n = 0;

        while (original != 0) {
            original /= 10;
            n++;
        }
        
        original = num;
        while (original != 0) {
            int digit = original % 10;
            result += Math.pow(digit, n);
            original /= 10;
        }

        if (result == num) {
            System.out.println("Given number is Armstrong number");
        } else {
            System.out.println("Given number is not Armstrong number");
        }
    }
}
