import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select a statement:");
            System.out.println("1. if-else");
            System.out.println("2. switch");
            System.out.println("3. for loop");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("if-else syntax: if (condition) { ... } else { ... }");
                    break;
                case 2:
                    System.out.println("switch syntax: switch (variable) { case x: ... break; }");
                    break;
                case 3:
                    System.out.println("for loop syntax: for (init; condition; update) { ... }");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
