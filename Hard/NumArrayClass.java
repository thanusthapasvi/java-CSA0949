package Hard;

class NumArray {
    int[] nums;
    int[] segmentTree;
    int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        segmentTree = new int[2 * n];
        buildTree();
    }

    private void buildTree() {
        for (int i = 0; i < n; i++) segmentTree[n + i] = nums[i];
        for (int i = n - 1; i > 0; --i) segmentTree[i] = segmentTree[2 * i] + segmentTree[2 * i + 1];
    }

    public void update(int index, int val) {
        int pos = index + n;
        segmentTree[pos] = val;
        while (pos > 0) {
            int left = pos, right = pos;
            if (pos % 2 == 0) right = pos + 1;
            else left = pos - 1;
            segmentTree[pos / 2] = segmentTree[left] + segmentTree[right];
            pos /= 2;
        }
    }

    public int sumRange(int left, int right) {
        int l = left + n, r = right + n, sum = 0;
        while (l <= r) {
            if (l % 2 == 1) sum += segmentTree[l++];
            if (r % 2 == 0) sum += segmentTree[r--];
            l /= 2;
            r /= 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1, 3, 5});
        System.out.println(numArray.sumRange(0, 2));
        numArray.update(1, 2);                      
        System.out.println(numArray.sumRange(0, 2));
    }
}
