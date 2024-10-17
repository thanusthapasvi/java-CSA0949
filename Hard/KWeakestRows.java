package Hard;

import java.util.Arrays;
import java.util.Comparator;

public class KWeakestRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[] soldiersCount = new int[m];
        for (int i = 0; i < m; i++)
            soldiersCount[i] = countSoldiers(mat[i]);

        Integer[] indices = new Integer[m];
        for (int i = 0; i < m; i++)
            indices[i] = i;

        Arrays.sort(indices, Comparator.comparingInt((Integer i) -> soldiersCount[i]).thenComparingInt(i -> i));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = indices[i];
        }

        return result;
    }

    private static int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) count++;
            else break;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k = 3; // Example input
        int[] result = kWeakestRows(mat, k);
        System.out.println(Arrays.toString(result));
    }
}
