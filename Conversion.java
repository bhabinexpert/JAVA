import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num1 = input.nextInt();

        input.nextLine(); //clear buffer

        System.out.print("Enter the conversion type binary or decimal (b/d): ");
        String str = input.nextLine();

        if (str.equalsIgnoreCase("b")) {
            // decimal → binary
            System.out.println("Binary (4-bit): " + decimalToBinary(num1));
        }
        else if (str.equalsIgnoreCase("d")) {
            // binary → decimal
            System.out.println("Decimal: " + binaryToDecimal(num1));
        }
        else {
            System.out.println("Invalid conversion type!");
        }
    }

    // ✅ Convert 4-bit binary number to decimal
    public static int binaryToDecimal(int num) {
        int decimal = 0;
        int base = 1;

        while (num > 0) {
            int lastDigit = num % 10;
            decimal += lastDigit * base;
            base *= 2;
            num /= 10;
        }
        return decimal;
    }

    // ✅ Convert decimal to 4-bit binary
    public static String decimalToBinary(int num) {
        if (num == 0) return "0000";

        String binary = "";
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num /= 2;
        }

        // pad to 4 bits
        while (binary.length() < 4) {
            binary = "0" + binary;
        }

        // if more than 4 bits, keep last 4 bits
        if (binary.length() > 4) {
            binary = binary.substring(binary.length() - 4);
        }

        return binary;
    }
}
