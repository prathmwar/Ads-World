import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");


        int choice = s.nextInt();

        switch (choice) {
            case 1:
                linearSearch();
                break;
            case 2:
                binarySearch();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static void linearSearch() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int k = s.nextInt();

        int result = lS(a, k);

        if (result == -1) {
            System.out.print("Element is not present in the array");
        } else {
            System.out.print(k + " present at index " + result);
        }
    }

    public static int lS(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void binarySearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array must be sorted");
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int A[] = new int[size];

        System.out.println("Enter the elements of the array in sorted order: ");
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched: ");
        int k = sc.nextInt();

        int result = bS(A, k);

        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("The element " + k + " is present at index " + result);
        }
    }

    public static int bS(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                if (mid == 0 || arr[mid - 1] != key) {
                    return mid;
                }
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

