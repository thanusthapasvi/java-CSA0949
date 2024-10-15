package Hard;

import java.util.Scanner;

public class ReverseAddPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = sc.nextLong();

        if (num < 0) {
            System.out.println("Negative numbers are not allowed.");
            return;
        }

        while (!isPalindrome(num)) {
            long reverseNum = reverse(num);
            System.out.println(num + " + " + reverseNum + " = " + (num + reverseNum));
            num += reverseNum;
        }

        System.out.println("Palindrome: " + num);
    }

    private static boolean isPalindrome(long num) {
        return num == reverse(num);
    }

    private static long reverse(long num) {
        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}

