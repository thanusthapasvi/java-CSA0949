public class CompositeNumbers {
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        System.out.println("Number of Composite Numbers: " + countCompositeNumbers(arr));
    }

    public static int countCompositeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isComposite(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
