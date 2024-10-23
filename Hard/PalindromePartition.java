package Hard;

public class PalindromePartition {
    boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

    int minCuts(String s) {
        int n = s.length();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = i;

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (isPalindrome(s, j, i)) {
                    dp[i] = j == 0 ? 0 : Math.min(dp[i], dp[j - 1] + 1);
                }
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        String s = "aabbc";
        PalindromePartition pp = new PalindromePartition();
        System.out.println("Minimum cuts: " + pp.minCuts(s));
    }
}
