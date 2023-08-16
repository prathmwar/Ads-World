import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array is: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}