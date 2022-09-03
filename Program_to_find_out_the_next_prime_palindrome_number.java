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
    public static boolean prime(int m)
    {
          int cont=0;

        for(int i=2;i<=(int)(Math.sqrt(m));i++)
        {
            if(m%i==0)
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
        int a,b=0;
        a = sc.nextInt();
        for(int j=(1+a);;j++)
        {
            if(prime(j) && pail(j)){
            b = j;
            break;
            }
        }
        System.out.println(b);
    }
}