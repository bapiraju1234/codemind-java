import java.util.Scanner;
 
class GFG {
 
    // Returns true if the given number is Abundant
    public static boolean isAbundantNumber(int n)
    {
        // To store the sum of divisors
        int sum = 0;
 
        // Loop through the numbers [1,n-1]
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
 
        // A number n is said to be Abundant Number if
        // sum of all the proper divisors of the number
        // is greater than the value of the number n.
        if (sum > n) {
            return true;
        }
        else {
            return false;
        }
    }
 
    // Driver program
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if (isAbundantNumber(n)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}