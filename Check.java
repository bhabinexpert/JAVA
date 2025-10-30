import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        if(x%2==0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        if( a == b){
//            System.out.println("Equal");
//        } else{
//            if(a > b){
//                System.out.println("a is greater than b");
//            }
//            else{
//                System.out.println("b is greater than a");
//            }
//        }

        if ( a== b){
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
}
