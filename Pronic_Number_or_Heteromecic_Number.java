import java.io.*;
import java.util.*;
import java.math.*;
 
class GFG
{
    static boolean pronic_check(int n)
    {
        int x = (int)(Math.sqrt(n));
     
        if (x * (x + 1) == n)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();       
        if (pronic_check(n)==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}