import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.print("Enter a string or number : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.equalsIgnoreCase(new StringBuilder(input).reverse().toString()) ? "Palindrome" : "Not a palindrome");
        scanner.close();
    }
}
