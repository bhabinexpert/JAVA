import java.util.Scanner;

public class BitManipulation {
    // program to count 1's in binary representation
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String binary = decimalToBinary(number);
        System.out.println(binary + " is the 4-bit binary representation of " + number);

        int ones = countOnes(binary);
        System.out.println(ones + " ones are present in the binary representation.");
    }

    // Convert decimal to 4-bit binary
    public static String decimalToBinary(int num) {
        if (num == 0) return "0000";

        String binary = "";
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;  // prepend
            num /= 2;
        }

        // ✅ Pad to 4 bits
        while (binary.length() < 4) {
            binary = "0" + binary;
        }

        // ✅ Ensure only 4 bits (in case num > 15)
        if (binary.length() > 4) {
            binary = binary.substring(binary.length() - 4);
        }

        return binary;
    }

    // Count number of '1's
    public static int countOnes(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
