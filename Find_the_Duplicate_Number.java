import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,count=0;
        n = sc.nextInt();
        x = new int[n];
        for(i=0;i<n;i++)
            x[i] = sc.nextInt();
        for(i = 0; i < n; i++)
        {  
            for(int j = i + 1;j<n; j++)
            {  
                if(x[i] == x[j])  
                    System.out.println(x[j]);
            }
            
        }
    }
    
}