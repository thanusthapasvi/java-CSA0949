import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        ArrayList<Integer> mergedList = new ArrayList<>();

        for (int i : arr1) {
            mergedList.add(i);
        }
        for (int i : arr2) {
            mergedList.add(i);
        }

        Collections.sort(mergedList);

        System.out.println("Merged Array:");
        for (int i : mergedList) {
            System.out.print(i + " ");
        }
    }
}
