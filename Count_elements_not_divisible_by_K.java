import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,cont=0,k;
        n = sc.nextInt();
        k = sc.nextInt();
        x = new int[n];
        for(i=0;i<n;i++)
            x[i] = sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%k!=0)
            {
                cont++;
            }
        }
        System.out.println(cont);
    }
}