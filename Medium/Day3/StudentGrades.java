import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMarks = 0;
        int subjects = 4;
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the marks in subject " + (i + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double marks = scanner.nextDouble();
                if (marks < 0) {
                    System.out.println("Marks cannot be negative.");
                    return;
                }
                totalMarks += marks;
            } else {
                System.out.println("Invalid input. Please enter valid marks.");
                return;
            }
        }
        double avg = totalMarks / subjects;
        System.out.println("Total = " + totalMarks);
        System.out.println("avg = " + avg);

        if (avg > 75) {
            System.out.println("Grade: DISTINCTION");
        } else if (avg >= 60) {
            System.out.println("Grade: FIRST DIVISION");
        } else if (avg >= 50) {
            System.out.println("Grade: SECOND DIVISION");
        } else if (avg >= 40) {
            System.out.println("Grade: THIRD DIVISION");
        } else {
            System.out.println("Grade: FAIL");
        }
        scanner.close();
    }
}