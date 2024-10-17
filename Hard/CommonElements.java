package Hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonElements {
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> commonElements = new ArrayList<>();
        
        for (int num : arr1) {
            set.add(num);
        }
        
        for (int num : arr2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }
        
        return commonElements;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6, 7};
        
        List<Integer> result = findCommonElements(arr1, arr2);
        System.out.println(result);
    }
}

