import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        String id,name;
        int units;
        double bill;
        Scanner sc=new Scanner(System.in);
        id=sc.nextLine();
        name=sc.nextLine();
        units=sc.nextInt();
        if (units<=199)
             bill=units*1.20;
        else if (units>=200 && units<400)
             bill=units*1.50;
        else if (units>=400 && units<600)
            bill=units*1.80;
        else
            bill=units*2.00;
            
        if (bill>400)
        {
            bill=bill+bill*0.15;
        }
        else
        {
            bill=bill+100;
        }
        System.out.format("%.2f",(bill));
    }
}