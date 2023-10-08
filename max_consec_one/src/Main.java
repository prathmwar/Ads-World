import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        int n = s.nextInt();
        int a[] = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == 1)
                cnt++;
            if (cnt == n) {
                System.out.println(n);
                return;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                int l = 0;
                int j = i - 1;
                while (j >= 0 && a[j] == 1) {
                    l++;
                    j--;
                }
                int r = 0;
                int k = i + 1;
                while (k < n && a[k] == 1) {
                    r++;
                    k++;
                }
                System.out.println(l + r + 1);
                if ((l + r + 1) > ans) {
                    ans = l + r + 1;
                }
            }
        }
        System.out.println(ans);
    }
}
