import java.util.Scanner;
class simple
{
    public static boolean prime(int n)
    {
        int cont=0;

        for(int i=2;i<=(int)(Math.sqrt(n));i++)
        {
            if(n%i==0)
            cont++;
        }
        if(cont==0)
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
        if(a<2)
        a = 2;
        for(int j=a;j<=b;j++)
        {
            if(prime(j))
            System.out.println(j);
        }
        
    }
}