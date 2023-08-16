import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int A[]= new int[size];

        System.out.println("Enter the element in array: ");

        for(int i=0;i<size;i++)
        {
            A[i]=sc.nextInt();
        }

        int temp=0,j=0;

        for(int i=1;i<size;i++)
        {
            temp=A[i];
            j=i;
            while(j>0 && A[j-1]>temp)
            {
                A[j]=A[j-1];
                j--;
            }
            A[j]=temp;
        }
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.println(A[i]);
        }



    }
}