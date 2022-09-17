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
        int n,x[],i,cont=0;
        n = sc.nextInt();
        x = new int[n];
        for(i=0;i<n;i++)
            x[i] = sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(pail(x[i]))
            cont++;
        }
        System.out.println(cont);
    }
}