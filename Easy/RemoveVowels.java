import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String output = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println("The string without vowels is: " + output);
    }
}
