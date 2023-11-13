import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1
        System.out.println("Example 1:");

        // Input: Number of routes for Example 1
        System.out.print("Enter the number of bus routes for Example 1: ");
        int numRoutes1 = scanner.nextInt();
        int[][] routes1 = new int[numRoutes1][];
        for (int i = 0; i < numRoutes1; i++) {
            System.out.print("Enter the number of stops for route " + (i + 1) + ": ");
            int numStops = scanner.nextInt();
            routes1[i] = new int[numStops];
            System.out.print("Enter stops for route " + (i + 1) + ": ");
            for (int j = 0; j < numStops; j++) {
                routes1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the source stop for Example 1: ");
        int source1 = scanner.nextInt();
        System.out.print("Enter the target stop for Example 1: ");
        int target1 = scanner.nextInt();

        int result1 = numBusesToDestination(routes1, source1, target1);
        System.out.println("Result: " + result1);

        // Example 2
        System.out.println("Example 2:");

        // Input: Number of routes for Example 2
        System.out.print("Enter the number of bus routes for Example 2: ");
        int numRoutes2 = scanner.nextInt();
        int[][] routes2 = new int[numRoutes2][];
        for (int i = 0; i < numRoutes2; i++) {
            System.out.print("Enter the number of stops for route " + (i + 1) + ": ");
            int numStops = scanner.nextInt();
            routes2[i] = new int[numStops];
            System.out.print("Enter stops for route " + (i + 1) + ": ");
            for (int j = 0; j < numStops; j++) {
                routes2[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the source stop for Example 2: ");
        int source2 = scanner.nextInt();
        System.out.print("Enter the target stop for Example 2: ");
        int target2 = scanner.nextInt();

        int result2 = numBusesToDestination(routes2, source2, target2);
        System.out.println("Result: " + result2);

        // User Interactive
        System.out.println("User Interactive:");

        // Input: Number of routes
        System.out.print("Enter the number of bus routes: ");
        int numRoutes = scanner.nextInt();

        // Input: Bus routes
        int[][] routes = new int[numRoutes][];
        for (int i = 0; i < numRoutes; i++) {
            System.out.print("Enter the number of stops for route " + (i + 1) + ": ");
            int numStops = scanner.nextInt();
            routes[i] = new int[numStops];
            System.out.print("Enter stops for route " + (i + 1) + ": ");
            for (int j = 0; j < numStops; j++) {
                routes[i][j] = scanner.nextInt();
            }
        }

        // Input: Source stop
        System.out.print("Enter the source stop: ");
        int source = scanner.nextInt();

        // Input: Target stop
        System.out.print("Enter the target stop: ");
        int target = scanner.nextInt();

        // Call the function and print the result
        int result = numBusesToDestination(routes, source, target);
        System.out.println("Minimum number of buses needed: " + result);
    }

    public static int numBusesToDestination(int[][] w, int s, int target) {
        if (s == target) {
            return 0;
        }

        int maxStop = -1;
        for (int[] route : w) {
            for (int stop : route) {
                maxStop = Math.max(maxStop, stop);
            }
        }

        if (maxStop < target) {
            return -1;
        }

        int n = w.length;
        int[] minBusesToReach = new int[maxStop + 1];
        Arrays.fill(minBusesToReach, n + 1);
        minBusesToReach[s] = 0;

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int[] route : w) {
                int min = n + 1;
                for (int stop : route) {
                    min = Math.min(min, minBusesToReach[stop]);
                }
                min++;
                for (int stop : route) {
                    if (minBusesToReach[stop] > min) {
                        minBusesToReach[stop] = min;
                        flag = true;
                    }
                }
            }
        }

        return (minBusesToReach[target] < n + 1 ? minBusesToReach[target] : -1);
    }
}
