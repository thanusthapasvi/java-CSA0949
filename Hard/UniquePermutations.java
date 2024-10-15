package Hard;

import java.util.*;

public class UniquePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number: ");
        int num = sc.nextInt();
        String numberStr = Integer.toString(Math.abs(num));
        
        Set<String> permutations = new HashSet<>();
        permute(numberStr, 0, numberStr.length() - 1, permutations);
        
        if (num < 0) {
            Set<String> negativePermutations = new HashSet<>();
            for (String perm : permutations) {
                negativePermutations.add("-" + perm);
            }
            permutations = negativePermutations;
        }

        System.out.println("Permutations are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    private static void permute(String str, int l, int r, Set<String> set) {
        if (l == r) {
            set.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, set);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

