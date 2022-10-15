import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n = sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}