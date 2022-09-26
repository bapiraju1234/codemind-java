import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cap,s,t,b;
        s = sc.nextInt();
        t = sc.nextInt();
        b = sc.nextInt();
        cap = 2*s*t*b*512;
        System.out.format((int)(cap/1024)+"KB");
        }
}