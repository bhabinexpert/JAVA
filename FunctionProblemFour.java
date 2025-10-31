import java.util.Scanner;

public class FunctionProblemFour {
    public static void checkGraterNumber(int a, int b){
        if(a>b){
            System.out.println("First number is greater than that");
        }else{
            System.out.println("Second number is greater than first number.");
        }
    }

    public static void circumference(float a){
        float circumference = (float) (2 * 3.14 * a);
        System.out.println("The circumference is " + circumference);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        checkGraterNumber(a,b);

        System.out.print("Enter the radius of the Circle:");
        float radius = input.nextFloat();


        circumference(radius);
    }
}
