import java.util.Scanner;

public class FactorialwithRecursion {
    // factorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the number: ");
        int ans = factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_n = factorial(n-1);
        int fact_m = n * fact_n;
        return fact_m;


    }
}
