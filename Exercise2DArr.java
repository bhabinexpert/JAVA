import java.util.Scanner;

public class Exercise2DArr {
    public static void main(String[] args) {
        // Matrix input from user, search for a given number x, and print the indices where it occurs

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Search for element
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;

        // Traverse and check
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Element " + x + " found at index (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element " + x + " not found in the matrix.");
        }


    }
}
