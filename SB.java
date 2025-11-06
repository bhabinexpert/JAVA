import java.util.Scanner;

public class SB {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //charAt
        System.out.println(sb.charAt(2));


        sb.insert(0, "B");
        System.out.println(sb);
        //set char;
        sb.setCharAt(2, 'C');
        System.out.println(sb);


        sb.delete(1,2);
        System.out.println(sb);
    }
}
