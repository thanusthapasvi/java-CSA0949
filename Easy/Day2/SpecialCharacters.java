import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a line of text:");
        String input = scanner.nextLine();
        int count = 0;
        StringBuilder specialChars = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialChars.append(ch).append(" ");
                count++;
            }
        }

        System.out.println("Special characters: " + specialChars.toString());
        System.out.println("Number of special characters: " + count);
        scanner.close();
    }
}
