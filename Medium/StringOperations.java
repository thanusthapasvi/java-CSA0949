import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String replaced = input.replace("Saveetha", "XYZ");
        System.out.println("After Replace: " + replaced);
        System.out.println("Length of the String: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
    }
}
