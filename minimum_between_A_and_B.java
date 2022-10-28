import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=0,flag=0;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        min=b;
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                if(min>arr[i]){
                    min=arr[i];
                    flag=1;
                }
            }
        }
        if(flag==0)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}