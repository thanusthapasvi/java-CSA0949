import java.util.Scanner;

class Student {
    String name;
    int registerNumber;
    int[] marks = new int[5];

    public Student(String name, int registerNumber, int[] marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
    }

    public void calculate() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / 5.0;
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class AveragewithClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Register Number: ");
        int registerNumber = sc.nextInt();
        int[] marks = new int[5];
        System.out.println("Enter Marks for 5 Subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Student student = new Student(name, registerNumber, marks);
        student.calculate();
    }
}
