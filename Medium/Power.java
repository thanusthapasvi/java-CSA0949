public class Power {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= x;
            }
            x *= x;
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.myPow(2.00000, 10));
    }
}
