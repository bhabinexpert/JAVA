import java.util.Scanner;

public class Problem1 {
    //Write a program to find if a number is a power of 2 or not.
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Number: ");
      int number = sc.nextInt();

      if (PowerOfTwo(number)){
          System.out.println(number + " is a power of two");

      }else{
          System.out.println(number + " is not a power of two");
      }

    }

    public static boolean PowerOfTwo(int number){
        return number > 0 &&(number & (number-1)) == 0;
    }
}
