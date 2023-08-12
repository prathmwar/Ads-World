import java.lang.*;
import java.util.*;

public class Q3_Prathmesh_Katepallewar_21_ETB_SY
{
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of layers: ");
        int Layers=s.nextInt();
        int TimeforLayer=2;
        System.out.print("Enter no of min for appe has been baked: ");
        int TimeforCooking=s.nextInt();
        System.out.print("Total time for baking is "+(Layers*TimeforLayer+TimeforCooking)+" min");

    }
}