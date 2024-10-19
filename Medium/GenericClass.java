import java.util.Arrays;

class GenericSorter<T extends Comparable<T>> {
    private T[] values;

    public GenericSorter(T[] values) {
        this.values = values;
    }

    public void sort() {
        Arrays.sort(values);
    }

    public void display() {
        for (T value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intValues = {5, 2, 9, 1};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intValues);
        intSorter.sort();
        intSorter.display();

        String[] stringValues = {"Banana", "Apple", "Orange"};
        GenericSorter<String> stringSorter = new GenericSorter<>(stringValues);
        stringSorter.sort();
        stringSorter.display();
    }
}
