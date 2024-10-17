package Hard;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}

