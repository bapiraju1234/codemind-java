import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,c,b;
        n = sc.nextInt();
        while(n>0)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a+b;
            System.out.println(c);
        }
    }
}