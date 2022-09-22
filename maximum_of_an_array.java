import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,cont=0,max;
        n = sc.nextInt();
        x = new int[n];
        for(i=0;i<n;i++)
            x[i] = sc.nextInt();
        max=x[0];
        for(i=0;i<n;i++)
        {
           if(x[i]>max){
                max=x[i];
           }
        }
        System.out.println(max);
    }
}