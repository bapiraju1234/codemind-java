import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,cont=0,temp=0;
        n = sc.nextInt();
        x = new int[n];
        for(i=0;i<n;i++)
            x[i] = sc.nextInt();
        for(i=0;i<n;i++)
        {
           if(x[i]%2!=0){
                temp = x[i];
           }
        }
        System.out.println(temp);
    }
}