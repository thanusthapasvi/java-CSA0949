
import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
