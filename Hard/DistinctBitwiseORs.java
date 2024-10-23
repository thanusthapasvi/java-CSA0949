package Hard;

import java.util.HashSet;
import java.util.Set;

public class DistinctBitwiseORs {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        for (int num : arr) {
            Set<Integer> next = new HashSet<>();
            next.add(num);
            for (int x : cur) next.add(x | num);
            res.addAll(next);
            cur = next;
        }
        return res.size();
    }

    public static void main(String[] args) {
        DistinctBitwiseORs obj = new DistinctBitwiseORs();
        int[] arr = {1, 1, 2};
        System.out.println(obj.subarrayBitwiseORs(arr)); // Output: 3
    }
}
