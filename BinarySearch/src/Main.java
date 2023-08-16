import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int A[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++)
        {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            System.out.println(A[i]);
        }
        System.out.println("Enter the number to be searched: ");
        int k= sc.nextInt();
        int s=0,E= size-1;
        while(s<=E)
        {
            int m = (s+E)/2;
            if(A[m]==k)
            {
                System.out.println("The element " + k +" is present at index " +m);
            }
            if(A[m]<k)
            {
                s=m+1;
            }
            else
            {
                E=m-1;
            }
        }

    }
}