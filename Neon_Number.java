import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=0,r,n,sq;
        n = sc.nextInt();
        sq = n*n;
        while(sq>0)
        {
        r = sq%10;
        num = num + r;
        sq = sq/10;
        }
        if(n==num)
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
    }
}