import java.util.Scanner;

public class FunctionsExercise {
    public static void Average(int a, int b, int c){
        int average = (a+b+c)/3;
        System.out.println("The average of three numbers is " + average);
    }

    public static int sumOfOddNumbers(int a){
        int oddNumber = 1;
        for(int i=1; i<a; i++){
            oddNumber = oddNumber + 2;
        }
        System.out.println("The sum of odd numbers is " + oddNumber);
        return oddNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();

//        Average(a, b, c);
        sumOfOddNumbers(a);
    }
}
