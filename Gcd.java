import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int gcd = findGCD(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    // Function to find GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a; // when b becomes 0, a is the GCD
    }
}
