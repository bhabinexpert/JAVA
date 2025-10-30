import java.util.Scanner;

public class LoopsExercise {
    public static void main(String[] args){
        //Find the sum of First n Natural Numbers;

        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
//        int sum = 0;
//
//        for(int i = 1; i <= a; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

        for(int i = 1; i<=10; i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
