public class ClearBit {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;

        int bitmask = 1<<position;
        int negation = ~(bitmask);
        int newNumber = negation & n;

        System.out.println("New Number: " + newNumber);
    }
}
