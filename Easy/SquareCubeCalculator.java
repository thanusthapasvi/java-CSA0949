import java.util.Scanner;

public class SquareCubeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number: ");
        double num = sc.nextDouble();

        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);

        System.out.println("Square Number: " + square);
        System.out.println("Cube Number: " + cube);
    }
}
