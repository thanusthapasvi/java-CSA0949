import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        String paragraph = "Ram hit a ball, the hit ball flew far after it was hit";
        String[] banned = {"hit"};
        
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!bannedWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        String result = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most frequent word: " + result);
    }
}
