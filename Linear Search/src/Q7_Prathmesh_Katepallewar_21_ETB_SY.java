import java.util.Scanner;
import java.lang.*;

public class Q7_Prathmesh_Katepallewar_21_ETB_SY {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int [] a = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int k=s.nextInt();

        int result = lS(a,k);

        if(result ==-1)
        {
            System.out.print("Element is not present in the array");
        }
        else
        {
            System.out.print( k + " present at index " + result);
        }
    }
    public static int lS(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}