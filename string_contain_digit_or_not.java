import java.util.Scanner;
class simple{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        int vowel=0;
        String vol = "1234567890";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(vol.contains(ch+""))
                vowel++;
        }
        if(vowel==0)
        System.out.println("Doesn't contain digit");
        else
        System.out.println("Contains "+vowel+" digit");

    }
}
