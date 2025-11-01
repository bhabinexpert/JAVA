import java.util.Scanner;

public class ArrayExercise {
    //Take an array as an input from the user and search for a
    // given number x and print the index at which it occurs.-
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the Number whose indexing you want to know:");
        int index = sc.nextInt();

        for(int i = 0; i<size; i++){
            if(numbers[i]==index){
                System.out.println("The index of the searched number is:" + i);
            }
        }
    }
}
