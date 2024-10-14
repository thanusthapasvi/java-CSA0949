
import java.util.Scanner;

class FibonacciSeries implements Runnable {
    private int count;

    FibonacciSeries(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

public class FibonacciGenerator {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        FibonacciSeries fib = new FibonacciSeries(n);
        Thread thread = new Thread(fib);
        thread.start();
    }
}
