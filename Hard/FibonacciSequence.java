package Hard;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        backtrack(num, result, 0);
        return result;
    }

    private boolean backtrack(String num, List<Integer> result, int index) {
        if (index == num.length() && result.size() >= 3) return true;

        for (int i = index; i < num.length(); i++) {
            if (num.charAt(index) == '0' && i > index) break;
            long currentNum = Long.parseLong(num.substring(index, i + 1));
            if (currentNum > Integer.MAX_VALUE) break;

            int size = result.size();
            if (size >= 2 && currentNum > result.get(size - 1) + result.get(size - 2)) break;
            if (size <= 1 || currentNum == result.get(size - 1) + result.get(size - 2)) {
                result.add((int) currentNum);
                if (backtrack(num, result, i + 1)) return true;
                result.remove(result.size() - 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FibonacciSequence fibSeq = new FibonacciSequence();
        System.out.println(fibSeq.splitIntoFibonacci("1101111"));
    }
}

