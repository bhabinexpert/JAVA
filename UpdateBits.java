import java.util.Scanner;

public class UpdateBits {
    public static void main(String[] args) {
        int n=5; //0101
        int position = 1;

        Scanner input = new Scanner(System.in);
        int oper = input.nextInt();

        int bitMask = 1<<position;
        if(oper==1){
            int newNumber = bitMask | n;
            System.out.println("New Number: " + newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask | n;
            System.out.println("New Number: " + newNumber);
        }
    }
}
