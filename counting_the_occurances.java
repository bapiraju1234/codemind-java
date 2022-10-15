import java.util.Scanner;
class simple{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        char  c = sc.next().charAt(0);
        int count=0,j=1;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch==c)
                count++;
        }
        if(count==0)
        System.out.println("-1");
        else
        System.out.println(count);
    }
}