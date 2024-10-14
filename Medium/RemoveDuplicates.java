import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int i : arr) {
            uniqueElements.add(i);
        }

        System.out.println("Non-duplicate items: " + uniqueElements);
    }
}
