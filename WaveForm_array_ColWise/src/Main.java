import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r = s.nextInt();
        System.out.println("Enter the no of columns: ");
        int c = s.nextInt();
        int a[][] = new int[r][c];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = s.nextInt();
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Array in the  wave form: ");
        for(int j =0;j<c;j++)
        {
            if(j %2==0)
            {
                for(int i=0;i<r;i++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            else
            {
                for(int i=r-1;i>=0;i--)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}