import java.util.Scanner;

public class StringP1 {
    public static void main(String[] args) {
       // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
       Scanner input = new Scanner(System.in);
       int size = input.nextInt();

       String [] array = new String[size];
       int totalLength = 0;

       for (int i =0; i<size; i++){
           array[i] = input.next();
           totalLength += array[i].length();
       }
       System.out.println(totalLength);
    }
}
