public class TogglingBit {
   public static void main(String[] args){

       //write a program to toggle a bit position = "pos" in a number "n" .

       int position = 2;
       int number = 6;

       int bitMask = 1 << position;
        int result = bitMask ^ number;
        System.out.println(result);

   }
}
