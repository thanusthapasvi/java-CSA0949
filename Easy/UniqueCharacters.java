import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abcb";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Unique characters:");
        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                System.out.println(c);
            }
        }
    }
}
