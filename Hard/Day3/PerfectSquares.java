package Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = sc.nextInt();
        System.out.print("Enter upper range: ");
        int upperRange = sc.nextInt();

        if (lowerRange > upperRange) {
            System.out.println("Invalid input. Lower range cannot be greater than upper range.");
            return;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = (int) Math.ceil(Math.sqrt(lowerRange)); i <= Math.floor(Math.sqrt(upperRange)); i++) {
            int perfectSquare = i * i;
            if (perfectSquare >= lowerRange && perfectSquare <= upperRange && sumOfDigits(perfectSquare) < 10) {
                result.add(perfectSquare);
            }
        }

        System.out.println(result);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
