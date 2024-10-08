import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a statement:");
        String input = scanner.nextLine().toLowerCase();
        int vowelCount = 0;
        for (char ch : input.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels = " + vowelCount);
        scanner.close();
    }
}
