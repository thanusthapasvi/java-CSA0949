import java.util.Hashtable;

public class BankDetails {
    public static void main(String[] args) {
        Hashtable<Integer, String> bankDetails = new Hashtable<>();

        bankDetails.put(12345, "John Doe");
        bankDetails.put(67890, "Jane Smith");
        bankDetails.put(54321, "Emily Davis");
        System.out.println("Size of HashTable: " + bankDetails.size());
        bankDetails.clear();
        System.out.println("HashTable cleared. Size now: " + bankDetails.size());
    }
}
