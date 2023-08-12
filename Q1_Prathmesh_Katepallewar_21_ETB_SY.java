import java.util.Scanner;
public class Q1_Prathmesh_Katepallewar_21_ETB_SY
{
    public static void main(String[] args)
    {
        int num;
        System.out.println("Time for which Paneer Sabji in oven: ");
        Scanner s = new Scanner(System.in);
        num=s.nextInt();
        int n = 0;
        if(n>=0 && n<=40)
        {
            int Time=40-num;
            
            System.out.println("remaining time for complete cooking of Sabji is : "+Time);
        }
    }
}

