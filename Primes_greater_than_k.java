import java.util.Scanner;
class simple
{
    public static boolean prime(int n)
    {
        int cont=0;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            cont++;
        }
        if(cont==2)
            return true;
        else
            return false;
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,cont=0,k;
        n = sc.nextInt();
        x = new int[n];
        for(i=0;i<n;i++)
            x[i] = sc.nextInt();
        k = sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(prime(x[i]))
            {
                if(x[i]>=k)
                {
                cont++;
                }
            }
        }
        System.out.println(cont);
    }
}