package Hard;
import java.util.Scanner;

public class CollegeUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Enter the staff users: ");
        int staffUsers = scanner.nextInt();

        if (totalUsers < 0 || staffUsers < 0 || staffUsers > totalUsers) {
            System.out.println("Invalid input. Please enter valid total users and staff users.");
        } else {
            int nonTeachingStaff = staffUsers / 3;
            int studentUsers = totalUsers - staffUsers - nonTeachingStaff;
            System.out.println("Student Users: " + studentUsers);
        }

        scanner.close();
    }
}
