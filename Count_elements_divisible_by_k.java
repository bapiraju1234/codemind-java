import java.util.Scanner;
class Array
{
  public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int x[],i,n,cont=0,k;
		 n=sc.nextInt();

         x=new int[n];
         k = sc.nextInt();
         for(i=0;i<n;i++)
           {
             x[i]=sc.nextInt();
           }

         for(i=0;i<n;i++)
          {
             if(x[i]%k==0)
                cont++;
			  
           }
           System.out.println(cont);
     }
}
