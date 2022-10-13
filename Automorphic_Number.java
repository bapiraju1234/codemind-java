import java.util.*;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(solve(n))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
        
    }
    static boolean solve(int n){
        int sum=0;
        int len=(int)Math.log10(n)+1;
        int sq=n*n;
        int l=sq%(int)Math.pow(10,len);
        return (l==n)?true:false;
    }
}