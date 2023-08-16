import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] A = new int[size];

        System.out.println("Enter the elements in the array:");

        for (int i = 0; i < size; i++)
        {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - 1 - i; j++)
            {
                if (A[j] > A[j + 1])
                {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.println(A[i]);
        }
    }
}
