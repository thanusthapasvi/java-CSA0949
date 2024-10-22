import java.util.HashMap;

public class DistinctCharacters {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(charCount);
    }
}
