public class SetBits {
    public static void main(String[] args){
        int n = 5; // 0101
        int position = 1;

        int bitMask = 1 << position;

        if ((bitMask | n) == 0){
            System.out.println("Bit was Zero");
        }else{
            System.out.println("Bit was  One");
        }
    }
}
