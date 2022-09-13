import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=1,num=0,r,n;
        n = sc.nextInt();
        while(n>0)
        {
        r = n%10;
        sum = sum * r;
        num = num + r;
        n = n/10;
        }
        if(sum==num)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}