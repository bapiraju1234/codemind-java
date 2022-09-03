import java.util.Scanner;
class simple
{
    public static boolean pail(int n)
    {
        
        int r,sum=0;
        int temp = n;
        while(n>0)
        {
        r = n%10;
        sum = sum * 10 + r;
        n = n/10;
        }
        if(temp==sum)
        return true;
        else
        return false;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        for(int j=(a);j<=b;j++)
        {
            if(pail(j))
                System.out.print(j+" ");
        }
        
    }
}