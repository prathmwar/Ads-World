import java.util.Scanner;
import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = s.nextInt();
        int sum = calculateSum(n);
        System.out.print("Sum of first "+ n + " natural numbers is " + sum);
    }
    public static int calculateSum(int n){
        int sum = 0;
        for(int i=0;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
}