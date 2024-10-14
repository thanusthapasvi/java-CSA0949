import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 67, 48, 23, 5, 62};

        System.out.print("Enter the value of N: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n > 0 && n <= arr.length) {
                Arrays.sort(arr);
                System.out.println(n + "th Largest number: " + arr[arr.length - n]);
            } else {
                System.out.println("Invalid value for N. Please enter a value between 1 and " + arr.length);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
