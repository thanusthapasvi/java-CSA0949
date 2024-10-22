class Overload {
    public void setValues(int a, int b) {
        System.out.println("Two values: " + a + ", " + b);
    }

    public void setValues(int a) {
        System.out.println("One value: " + a);
    }
}

public class OverloadTest {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.setValues(10, 20);
        obj.setValues(5);
    }
}
