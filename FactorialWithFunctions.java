import java.util.Scanner;

public class FactorialWithFunctions {

    public static void Factorial(int a){
        if(a<0){
            System.out.println("The number is negative");
            return;
        }
        int factorial = 1;
        for(int i = a; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Factorial(a);
    }
}
