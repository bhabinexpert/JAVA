import java.util.Scanner;

public class FirstNaturalNumbers {
    public static void main(String[] args) {

        sumOfNnaturalNumbers(1, 5,0);
    }
    public static void sumOfNnaturalNumbers(int i, int n, int sum){
        if (i==n) {
            sum+= i;
            System.out.println(sum);
            return;
        }
            sum+=i;
        sumOfNnaturalNumbers(i+1, n, sum);
    }

}
