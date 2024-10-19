public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int n = 8;
        boolean[] present = new boolean[n + 1];

        for (int num : a) {
            present[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println("Missing number is: " + i);
                break;
            }
        }
    }
}
