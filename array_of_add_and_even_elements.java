import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        int a,n[];
        a=sc.nextInt();
        n=new int[a];
        for(int i=0;i<a;i++)
          {
              n[i]=sc.nextInt();
          }
        for(int i=0;i<a;i++)
        {
            if(n[i]%2!=0)
            {
                al.add(n[i]);
            }
        }
        for(int i=0;i<a;i++)
        {
            if(n[i]%2==0)
            {
                al.add(n[i]);
            }
        }
        for(int i:al)
        {
            System.out.print(i+" ");
        }
    }
}