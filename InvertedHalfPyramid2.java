public class InvertedHalfPyramid2 {
    public static void main(String[] args) {
        int a =4;
        for(int j = 1; j<=a; j++) {
            for (int i = 1; i <= a-j; i++) {
                System.out.print(" ");
            }
           for(int i = 1; i<=j; i++){
               System.out.print("*");
           }
           System.out.println();
        }


    }
}
