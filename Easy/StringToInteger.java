import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string representing an integer: ");
        String str = scanner.nextLine();
        int result = 0;
        boolean isNegative = false;
        if (str.charAt(0) == '-') {
            isNegative = true;
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = result * 10 + (c - '0');
        }
        if (isNegative) {
            result = -result;
        }
        System.out.println("Output: " + result);
        scanner.close();
    }
}
