import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series: ");
        int n = input.nextInt();


        Fibonacci(n);
    }

    public static void Fibonacci(int n){
            int first = 0, second = 1;
            System.out.print("Fibonacci Series:");

        for(int i=1; i<=n; i++) {
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
