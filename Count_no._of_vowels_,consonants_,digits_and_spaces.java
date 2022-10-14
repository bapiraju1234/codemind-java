import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v=0,c=1,d=0,w=0,s=0;
        String s1=sc.nextLine();
        for (int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            v++;
            else if(ch>= 'a' && ch<='z' || ch>='A' && ch<='Z')
            c++;
            else if(ch>=48 && ch<=57)
            d++;
            else if(ch==' ')
            w++;
            else
            s++;
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+(c-1));
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+w);
    }
}