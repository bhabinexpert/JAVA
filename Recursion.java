public class Recursion {
    // print numbers from 5 to 1.
    public static void main(String[] args) {
        int numbers = 5;
        PrintNumbers(numbers);
    }
    public static void PrintNumbers(int n){
        if (n==0) return;
        System.out.println(n);
        PrintNumbers(n-1);
    }
}
