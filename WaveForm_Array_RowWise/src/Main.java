import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
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

        System.out.println("Array in the wave form: ");

        for(int i=0;i<r;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            else
            {
                for(int j=c-1;j>=0;j--)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }


    }
}