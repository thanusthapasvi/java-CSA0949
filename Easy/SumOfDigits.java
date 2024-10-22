import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " digit number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Single digit sum: " + sum);
    }
}
