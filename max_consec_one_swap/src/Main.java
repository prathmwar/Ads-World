import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        System.out.print("Enter size of the array: ");
        int n = s.nextInt();

        int[] a = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int ans = 0;
        int l = 0;

        for (int i = 0; i<n; i++) {
            if (a[i] == 0) {
                ans++;
            }
            while (ans > 1) {
                if (a[l] == 0) {
                    ans--;
                }
                l++;
            }
            int currC = i - l + 1;
            if (currC > cnt) {
                cnt = currC;
            }
        }

        System.out.print("Maximum Count of Consecutive Ones: ");
        System.out.println(cnt);
    }
}
