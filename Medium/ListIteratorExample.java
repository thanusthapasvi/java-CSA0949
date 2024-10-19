import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String element = it.next();
            it.set(element + "+");
        }

        System.out.println("List with appended +: " + list);

        System.out.println("List in reverse order: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
    }
}
