import java.util.Scanner;

public class LeetcodeQn_9 {
    // Given an integer x, return true if x is a palindrome, and false otherwise.
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;  // negative numbers are not palindrome

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return reversed == original;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        boolean result = isPalindrome(n);
        System.out.println("Is palindrome?: " + result);
    }
}
