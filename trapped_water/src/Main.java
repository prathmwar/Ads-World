import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] H = {3, 2, 4, 1, 3, 5, 3, 4};

        System.out.println("Enter the index of the building idx: ");
        int building = s.nextInt();

        if (building >= 0 && building < H.length) {
            int result = trappedW(H, building);
            System.out.println("Trapped water for building at index " + building + ": " + result);
        } else {
            System.out.println("Invalid building index");
        }
    }

    public static int trappedW(int[] H, int idx) {
        int n = H.length;
        if (n <= 2 || idx < 0 || idx >= n) {
            return 0;
        }

        int[] maxL = new int[n];
        int[] maxR = new int[n];

        maxL[0] = H[0];
        for (int i = 1; i < n; i++) {
            maxL[i] = Math.max(maxL[i - 1], H[i]);
        }

        maxR[n - 1] = H[n - 1];
        for (int i = n - 2; i > 0; i--) {
            maxR[i] = Math.max(maxR[i + 1], H[i]);
        }

        int ans = 0;
        ans += Math.min(maxL[idx], maxR[idx]) - H[idx];

        return ans;
    }
}
