import java.util.HashMap;
import java.util.Map;

public class EmployeeRecord {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");

        System.out.println("Is map empty? " + employeeMap.isEmpty());
        employeeMap.remove(102);
        System.out.println("After removal: " + employeeMap);
        employeeMap.clear();
        System.out.println("Map cleared: " + employeeMap);
    }
}
