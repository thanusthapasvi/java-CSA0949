package Hard;

import java.util.Scanner;

public class PrimesAfterNthPrime {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int nthPrime(int n) {
        int count = 0, num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
    }

    public static void primesAfterNthPrime(int nthPrime, int n) {
        int count = 0, num = nthPrime + 1;
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + (count == n - 1 ? "" : ", "));
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        double input = sc.nextDouble();
        
        if (input % 1 != 0 || input <= 0) {
            System.out.println("Invalid input. Please enter a positive integer for N.");
            return;
        }

        int N = (int) input;

        if (N < 1) {
            System.out.println("Invalid input. N should be a positive integer.");
            return;
        }

        int nthPrime = nthPrime(N);
        System.out.println(N + "th Prime number is " + nthPrime);

        primesAfterNthPrime(nthPrime, N);
    }
}

