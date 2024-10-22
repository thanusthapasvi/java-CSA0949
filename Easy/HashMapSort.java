import java.util.*;

public class HashMapSort {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("cherry", 2);

        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByValue())
           .forEach(System.out::println);
    }
}
