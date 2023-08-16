import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int a[] = new int[n];


        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = 0;
        int e = n - 1;
        boolean isPalindrome = true;

        while (s < e) {
            if (a[e] != a[s]) {
                isPalindrome = false;
                break;
            }
            s++;
            e--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
