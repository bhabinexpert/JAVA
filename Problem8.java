import java.util.Scanner;

public class Problem8 {
    public static void oneNumberRaisedToThePowerOfAnother(int x, int y){
        int power = 1;
        for(int i = 1; i<=y; i++){
            power=power * x;

        }
        System.out.println(power);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First number: ");
        int x = input.nextInt();
        System.out.print("Enter a Second number: ");
        int n = input.nextInt();

        oneNumberRaisedToThePowerOfAnother(x, n);

    }
}
