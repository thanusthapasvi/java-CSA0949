package Hard;

import java.util.*;

public class AddBaseNegTwo {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int carry = 0, i = arr1.length - 1, j = arr2.length - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int x = (i >= 0) ? arr1[i--] : 0;
            int y = (j >= 0) ? arr2[j--] : 0;
            int sum = x + y + carry;
            result.add(sum & 1);
            carry = -(sum >> 1);
        }

        while (result.size() > 1 && result.get(result.size() - 1) == 0) result.remove(result.size() - 1);
        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) ans[k] = result.get(result.size() - 1 - k);
        return ans;
    }

    public static void main(String[] args) {
        AddBaseNegTwo obj = new AddBaseNegTwo();
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = {1, 0, 1};
        int[] result = obj.addNegabinary(arr1, arr2);
        for (int i : result) System.out.print(i + " ");
    }
}
