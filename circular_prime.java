import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
           if(n%i==0)
           {
               count++;
           }
           if(count==0)
           return true;
           else
            return false;
            
    }
    public static int reverse(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        int m;
        Scanner sc=new Scanner(System.in);
        
        m=sc.nextInt();
        
        if(!isPrime(m))
        {
            System.out.println("not prime");
        }
        else if(isPrime(reverse(m)))
        {
            
            System.out.println("circular prime");
        }
        else
        { 
            System.out.println("prime but not a circular prime");
        }
    }
}