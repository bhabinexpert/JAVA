public class InvertedHalfPyramidWithNumbers {
      public static void main(String[] args){
        int a = 5;
        for(int j =1; j<=a; j++){
            for(int i = 1; i <= a-j+1; i++){
                System.out.print(i);
            }
            System.out.println();
        }
      }
    
}
