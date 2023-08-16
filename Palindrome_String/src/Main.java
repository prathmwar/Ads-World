import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        if(isPalindrome(str))
        {
            System.out.println(str + " is the palindrome");
        }
        else
        {
            System.out.println(str + " is not palindrome");
        }
    }

    public static boolean isPalindrome(String str)
    {
        str = str.toLowerCase();
        int l = 0;
        int r = str.length() - 1;

        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}