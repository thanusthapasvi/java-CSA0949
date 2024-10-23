package Hard;

public class ThreeEqualParts {
    public int[] threeEqualParts(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        if (sum % 3 != 0) return new int[] { -1, -1 };

        int partSum = sum / 3, count = 0;
        int i1 = -1, i2 = -1, i3 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (count == 0) i1 = i;
                else if (count == partSum) i2 = i;
                else if (count == 2 * partSum) i3 = i;
                count++;
            }
        }

        while (i3 < arr.length) {
            if (arr[i1] == arr[i2] && arr[i2] == arr[i3]) {
                i1++; i2++; i3++;
            } else {
                return new int[] { -1, -1 };
            }
        }
        return new int[] { i1 - 1, i2 };
    }

    public static void main(String[] args) {
        ThreeEqualParts tep = new ThreeEqualParts();
        int[] arr = {1, 0, 1, 0, 1};
        int[] result = tep.threeEqualParts(arr);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
}

