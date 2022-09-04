import java.util.Scanner;
class simple
{
    public static int pail(int n)
    {
        
        int r,sum=0;
        int temp = n;
        while(n>0)
        {
        r = n%10;
        sum = sum * 10 + r;
        n = n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,temp=0;
        a = sc.nextInt();
        temp = a;
        if(pail(a)==temp)
        System.out.println("True");
        else
        System.out.println("False");
    }
}