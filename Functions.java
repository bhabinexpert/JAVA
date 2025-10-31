
import java.util.Scanner;

public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        
    }
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("The sum of two numbers is " + sum);

        int product = calculateProduct(a, b);
        System.out.println("The product of two numbers is " + product);
//        printMyName(name);
    }
    
}
