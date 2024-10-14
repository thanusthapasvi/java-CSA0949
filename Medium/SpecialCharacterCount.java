import java.util.Scanner;

public class SpecialCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the statement: ");
        String statement = sc.nextLine();

        int specialCharCount = 0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharCount);
    }
}
