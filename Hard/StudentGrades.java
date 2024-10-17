package Hard;

import java.util.Scanner;

class Student {
    protected int[] marks = new int[6];
    protected int total;
    protected double aggregate;

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {
            "Python",
            "C Programming",
            "Mathematics",
            "Physics",
            "Chemistry",
            "Professional Ethics"
        };

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter the marks in " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void calculateTotalAndAggregate() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        aggregate = (double) total / marks.length;
    }
}

class Grade extends Student {
    public void displayResults() {
        calculateTotalAndAggregate();
        System.out.println("Total = " + total);
        System.out.printf("Aggregate = %.2f\n", aggregate);
        System.out.println("Class: " + getGrade());
    }

    private String getGrade() {
        if (aggregate > 75) {
            return "DISTINCTION";
        } else if (aggregate >= 60) {
            return "FIRST DIVISION";
        } else if (aggregate >= 50) {
            return "SECOND DIVISION";
        } else if (aggregate >= 40) {
            return "THIRD DIVISION";
        } else {
            return "FAIL";
        }
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        Grade student = new Grade();
        student.inputMarks();
        student.displayResults();
    }
}

