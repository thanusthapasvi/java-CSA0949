package Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Given Number: ");
        int givenNumber = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (givenNumber == 0) {
            System.out.println("Number of factors = Infinite (Every number is a factor of 0)");
            System.out.println(N + "th factor does not exist.");
            return;
        }

        givenNumber = Math.abs(givenNumber);
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                factors.add(i);
            }
        }

        System.out.println("Number of factors = " + factors.size());

        if (N > 0 && N <= factors.size()) {
            System.out.println(N + "th factor of " + givenNumber + " = " + factors.get(N - 1));
        } else {
            System.out.println(N + "th factor does not exist.");
        }
    }
}
