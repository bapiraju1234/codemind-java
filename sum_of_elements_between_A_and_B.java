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
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                min = min + arr[i];
                }
            }
            System.out.println(min);
        }
    }