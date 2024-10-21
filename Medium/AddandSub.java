interface IterF1 {
    void add(int a, int b);
    void sub(int a, int b);
}

class Operations implements IterF1 {
    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class AddandSub {
    public static void main(String[] args) {
        Operations op = new Operations();
        op.add(5, 3);
        op.sub(5, 3);
    }
}
