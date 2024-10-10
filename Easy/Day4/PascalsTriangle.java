import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        int[][] triangle = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    triangle[i][j] = 1;
                else
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i-1; j++)
                System.out.print("   ");
            for (int j = 0; j <= i; j++)
                System.out.printf("%-8d", triangle[i][j]);
            System.out.println();
        }
    }
}
