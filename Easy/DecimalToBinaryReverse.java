import java.util.Scanner;

public class DecimalToBinaryReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);
        String reversedBinary = new StringBuilder(binary).reverse().toString();
        int reversedDecimal = Integer.parseInt(reversedBinary, 2);

        System.out.println("Binary: " + binary);
        System.out.println("Reversed Binary: " + reversedBinary);
        System.out.println("Decimal after reversing binary: " + reversedDecimal);
    }
}
