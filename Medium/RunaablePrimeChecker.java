import java.util.Scanner;

class PrimeCheck implements Runnable {
    private int num;

    public PrimeCheck(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num <= 1) {
            System.out.println(num + " is not Prime");
            return;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not Prime");
                return;
            }
        }
        System.out.println(num + " is Prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int input = sc.nextInt();
        PrimeCheck primeCheck = new PrimeCheck(input);
        Thread t = new Thread(primeCheck);
        t.start();
    }
}
