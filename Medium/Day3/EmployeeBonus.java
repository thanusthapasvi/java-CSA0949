import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade of the employee: ");
        char grade = scanner.next().charAt(0);
        System.out.print("Enter the employee salary: ");
        
        if (scanner.hasNextDouble()) {
            double salary = scanner.nextDouble();

            if (salary < 0)
                System.out.println("Invalid salary input.");
            else {
                double bonus = 0;
                switch (grade) {
                    case 'A':
                        bonus = 0.05 * salary;
                        break;
                    case 'B':
                        bonus = 0.10 * salary;
                        break;
                    default:
                        System.out.println("Invalid grade input.");
                        return;
                }

                if (salary < 10000)
                    bonus += 0.02 * salary;
                double totalSalary = salary + bonus;
                System.out.println("Salary = " + salary);
                System.out.println("Bonus = " + bonus);
                System.out.println("Total to be paid: " + totalSalary);
            }
        } else
            System.out.println("Invalid salary input.");
        scanner.close();
    }
}
