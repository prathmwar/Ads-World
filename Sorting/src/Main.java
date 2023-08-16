import java.util.Scanner;


public class Main
{
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
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the type of sorting you want to implement: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Quick Sort");
        int choice= sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                System.out.println("Enter the size of an array");
                int n = sc.nextInt();

                int A[] = new int[n];

                System.out.println("Enter the element in array");
                for (int i = 0; i < n; i++) {
                    A[i] = sc.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(A[i] + " ");
                }

                int temp = 0;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (A[j] > A[j + 1]) {
                            temp = A[j];
                            A[j] = A[j + 1];
                            A[j + 1] = temp;
                        }
                    }
                }
                System.out.print("sorted array is:" + " ");
                for (int i = 0; i < n; i++) {
                    System.out.println(A[i]);
                }
            }
            case 2:
            {
                System.out.println("Enter Array Size: ");
                int n= sc.nextInt();
                int A[]=new int[n];
                System.out.println("Enter Array Elements: ");
                for (int i=0;i<n;i++)
                {
                    A[i]=sc.nextInt();
                }
                int j,temp=0;
                for (int i=0;i<n;i++) {
                    j = i;
                    temp = A[i];
                    while (j > 0 && A[j - 1] > temp) {
                        A[j] = A[j - 1];
                        j--;
                    }
                    A[j] = temp;
                }
                System.out.print("The Sorted Array is:" + " ");
                for (int i=0;i<n;i++)
                {
                    System.out.println(A[i]);
                }
            }
            case 3:
            {
                {

                    System.out.println("Enter size of array: ");
                    int N = sc.nextInt();

                    int A[] = new int[N];

                    System.out.println("Enter Elements of Array: ");
                    for (int i = 0; i < N; i++)
                    {
                        A[i] = sc.nextInt();
                    }

                    QS(A, 0, N - 1);
                    System.out.print("Sorted Array is:" + " ");
                    for (int i = 0; i < N; i++)
                    {
                        System.out.print(A[i] + " ");
                    }
                }
            }
        }
    }
}