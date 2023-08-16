import java.lang.*;
import java.util.*;

public class Q6_Prathmesh_Katepallewar_21_ETB_SY
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total amount on bills: ");
        float Tamount = s.nextFloat();
        System.out.print("Amount on single bill: ");
        int OneBillA = s.nextInt();
        int NoBills = (int)(Tamount/OneBillA);
        System.out.print("No of bills: "+ NoBills);

    }
}