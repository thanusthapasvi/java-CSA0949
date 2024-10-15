package Hard;

import java.util.*;

public class SquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper range: ");
        int upper = sc.nextInt();

        if (lower > upper) {
            System.out.println("Invalid range.");
            return;
        }

        List<String> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            result.add("(" + i + ", " + (i * i) + ")");
        }

        System.out.println(result);
    }
}

