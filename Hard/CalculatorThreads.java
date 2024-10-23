package Hard;

class AddThread extends Thread {
    int a, b;
    AddThread(int a, int b) { this.a = a; this.b = b; }

    public void run() {
        System.out.println("Sum: " + (a + b));
    }
}

class SubtractThread extends Thread {
    int a, b;
    SubtractThread(int a, int b) { this.a = a; this.b = b; }

    public void run() {
        System.out.println("Difference: " + (a - b));
    }
}

class MultiplyThread extends Thread {
    int a, b;
    MultiplyThread(int a, int b) { this.a = a; this.b = b; }

    public void run() {
        System.out.println("Product: " + (a * b));
    }
}

class DivideThread extends Thread {
    int a, b;
    DivideThread(int a, int b) { this.a = a; this.b = b; }

    public void run() {
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Division by zero error");
        }
    }
}

public class CalculatorThreads {
    public static void main(String[] args) {
        AddThread add = new AddThread(10, 5);
        SubtractThread sub = new SubtractThread(10, 5);
        MultiplyThread mul = new MultiplyThread(10, 5);
        DivideThread div = new DivideThread(10, 5);

        add.start();
        sub.start();
        mul.start();
        div.start();
    }
}

