public class TestMultiplication {
    public static void main(String[] args) {
        int M = 4; // or any other value
        int N = 5; // or any other value
        
        if (N >= 0) {
            for (int i = 1; i <= N; i++) {
                System.out.println(i + " x " + M + " = " + (i * M));
            }
        } else {
            for (int i = -1; i >= N; i--) {
                System.out.println(i + " x " + M + " = " + (i * M));
            }
        }
    }
}
