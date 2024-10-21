import java.util.Scanner;

public class ProvidentFund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter basic salary: ");
            double basicSalary = sc.nextDouble();
            System.out.print("Enter PF rate (%): ");
            double pfRate = sc.nextDouble();

            double pfAmount = basicSalary * (pfRate / 100);
            System.out.println("Provident Fund Amount: " + pfAmount);
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            System.out.println("PF calculation completed.");
        }
    }
}
