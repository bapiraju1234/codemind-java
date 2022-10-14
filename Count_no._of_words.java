import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch==' ')
            count++;
        }
        System.out.println(count+1);
    }
}