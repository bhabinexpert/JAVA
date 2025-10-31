import java.util.Scanner;

public class Problem5 {
    public static void eligibilityForVoting(int a){
        if(a<=00){
            System.out.println("Age can't be Zero or negative");
        }else if(a > 18){
            System.out.println("You are  eligible to vote");
        }else{
            System.out.println("You are  not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = input.nextInt();

        eligibilityForVoting(age);
    }
}
