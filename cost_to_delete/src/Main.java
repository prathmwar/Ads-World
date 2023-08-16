import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] revA(int[] a, int n)
    {
        int s = 0;
        int e = n - 1;

        while(s < e)
        {
            int tmp = a[e];
            a[e] = a[s];
            a[s] = tmp;
            s++;
            e--;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        revA(a,n);

        int cst=0;
        for(int i=0;i<n;i++)
        {
            cst = cst + (a[i]*(i+1));
        }
        System.out.println(cst + " is the min cost to delete element");
    }
}