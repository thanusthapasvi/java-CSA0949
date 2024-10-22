import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "this is a test this is only a test";
        HashMap<String, Integer> wordCount = new HashMap<>();

        String[] words = str.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
