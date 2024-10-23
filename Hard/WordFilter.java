package Hard;

import java.util.HashMap;

class WordFilter {
    HashMap<String, Integer> map = new HashMap<>();

    public WordFilter(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int p = 0; p <= word.length(); p++) {
                String prefix = word.substring(0, p);
                for (int s = 0; s <= word.length(); s++) {
                    String suffix = word.substring(s);
                    map.put(prefix + "#" + suffix, i);
                }
            }
        }
    }

    public int f(String pref, String suff) {
        return map.getOrDefault(pref + "#" + suff, -1);
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "grape"};
        WordFilter wordFilter = new WordFilter(words);
        System.out.println(wordFilter.f("ap", "le")); 
        System.out.println(wordFilter.f("ba", "na"));
    }
}

