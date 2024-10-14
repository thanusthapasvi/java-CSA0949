import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = sc.nextLine();

        if (binaryStr.matches("[01]+")) {
            int decimal = Integer.parseInt(binaryStr, 2);
            String octal = Integer.toOctalString(decimal);
            System.out.println("Decimal Number: " + decimal);
            System.out.println("Octal Number: " + octal);
        } else {
            System.out.println("Invalid binary number input.");
        }
    }
}
