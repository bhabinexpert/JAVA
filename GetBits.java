public class GetBits {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1<<position;

        if ((bitMask & n)==0){
            System.out.println("Bit was Zero");
        }else{
            System.out.println("Bit was One");
        }
    }
}
