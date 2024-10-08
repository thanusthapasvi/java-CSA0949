import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Word: ");
        String word = scanner.nextLine();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) >= 0)
                    vowels.append(ch).append(" ");
                else
                    consonants.append(ch).append(" ");
            }
        }

        System.out.println("Consonants: " + consonants.toString().trim());
        System.out.println("Vowels: " + vowels.toString().trim());
        scanner.close();
    }
}
