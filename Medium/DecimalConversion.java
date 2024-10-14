import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Decimal Number: ");
        
        // Input validation for decimal numbers
        if (scanner.hasNextInt()) {
            int decimal = scanner.nextInt();
            System.out.println("Binary Number = " + Integer.toBinaryString(decimal));
            System.out.println("Octal = " + Integer.toOctalString(decimal));
        } else
            System.out.println("Invalid input. Please enter a valid decimal number.");        
        scanner.close();
    }
}
