import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        double a = sc.nextDouble();
        System.out.println("Please enter the operation you want to Perform.");
        System.out.println("+ " + "- " + "* " + "/ ");
        String operator = sc.next();
        System.out.println("Please enter the another Number:");
        double b = sc.nextDouble();

        switch(operator){
            case "+": System.out.println( a + b);
            break;
            case "-": System.out.println( a - b);
            break;
            case "*": System.out.println( a * b);
            break;
            case "/": System.out.println( a / b);
            break;
            default:System.out.println("Enter the valid Operator");


        }
    }
}
