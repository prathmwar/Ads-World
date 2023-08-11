import java.lang.*;
import java.util.*;
public class Q2_Prathmesh_Katepallewar_21_ETB_SY {
    public static void main(String[] args) {
        int TimeforLayer=2;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the no of layers in kulcha: ");
        int NoOfLayer=s.nextInt();
        System.out.print(TimeforLayer*NoOfLayer + " minutes required for cooking "+NoOfLayer +" layers of kulcha");
    }
}