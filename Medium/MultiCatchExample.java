public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            int[] arr = new int[5];
            arr[10] = 50;
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
