import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of row of A: ");
        int r1 = s.nextInt();
        System.out.println("Enter the no of columns of A: ");
        int c1 = s.nextInt();
        int a[][] = new int[r1][c1];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("matrix a is: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.println( a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the no rows of B: ");
        int r2 = s.nextInt();
        System.out.println("Enter the no of columns of B: ");
        int c2 = s.nextInt();
        int b[][] = new int[r2][c2];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j] = s.nextInt();
            }
        }
        System.out.println("matrix b is: ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.println( b[i][j] + " ");
            }
            System.out.println();
        }
        if(c1!=r2)
        {
            System.out.println("Multiplication is not possible");
            return;
        }
        int c[][] = new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                c[i][j] =0;
                for(int k=0;k<c1;k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];

                }
            }
        }
        System.out.println("Resultant matrix is: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }
    }
}