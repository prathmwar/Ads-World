import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        QS(a, 0, n - 1);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print( a[i] + " ");
        }
    }
    static void QS(int a[], int s, int e)
    {
        if (s < e)
        {
            int p = prt(a, s, e);
            QS(a, s, p - 1);
            QS(a, p + 1, e);
        }
    }
    static int prt(int a[], int s, int e)
    {
        int p = s;
        int c = a[e];

        for (int i = s; i < e; i++)
        {
            if (a[i] < c)
            {
                int tmp = a[i];
                a[i] = a[p];
                a[p] = tmp;
                p++;
            }
        }
        int tmp = a[e];
        a[e] = a[p];
        a[p] = tmp;
        return p;
    }
}
