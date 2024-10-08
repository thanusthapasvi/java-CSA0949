import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names separated by space:");
        String input = scanner.nextLine();
        System.out.println("Order(A/D): ");
        char order = scanner.next().charAt(0);
        List<String> names = Arrays.asList(input.split(" "));
        
        if (order == 'A' || order == 'a')
            Collections.sort(names);
        else if (order == 'D' || order == 'd')
            Collections.sort(names, Collections.reverseOrder());
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
