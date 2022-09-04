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
        int a,b,sum=0,c=0;
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        for(int j=(sum+1);;j++)
        {
            c++;
            if(prime(j))
            break;
        }
         System.out.println(c);
        
    }
}