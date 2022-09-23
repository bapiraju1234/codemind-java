import java.util.Scanner;
class simple
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,n;
        n = sc.nextInt(); 
        int temp = n;
        while(n>0)
        {
        r = n%10;
        sum = sum * 10 + r;
        n = n/10;
        }
        if(temp==sum)
        System.out.println("True");
        else
        System.out.println("False");
    }
}