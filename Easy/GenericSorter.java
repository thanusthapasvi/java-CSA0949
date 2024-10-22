import java.util.Arrays;

class Sorter<T extends Comparable<T>> {
    public T[] sort(T[] array) {
        Arrays.sort(array);
        return array;
    }
}

public class GenericSorter {
    public static void main(String[] args) {
        Sorter<Integer> intSorter = new Sorter<>();
        Integer[] intArray = {3, 5, 1, 4, 2};
        System.out.println(Arrays.toString(intSorter.sort(intArray)));

        Sorter<String> stringSorter = new Sorter<>();
        String[] strArray = {"apple", "orange", "banana", "pear"};
        System.out.println(Arrays.toString(stringSorter.sort(strArray)));
    }
}
