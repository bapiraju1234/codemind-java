import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        int a,n[],sum=0,cont=0;
        a=sc.nextInt();
        n=new int[a];
        for(int i=0;i<a;i++)
          {
              n[i]=sc.nextInt();
          }
        for(int i=0;i<a;i++)
        {
                sum = sum+n[i];
        }
        for(int i=0;i<a;i++)
        {
            if(n[i]<=(sum/a))
            cont++;
        }
            System.out.print(cont);
    }
}