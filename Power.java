public class Power {
    public static int CalculatePower(int x, int y){
        if (x==0){
            return 1;
        }
        if (y==0){
            return 1;
        }

        int xPowernm1 = CalculatePower(x,y-1);
        int xPower = x * xPowernm1;
        return xPower;

    }
    public static void main(String[] args) {
        int power = 3;
        int number = 2;
        int ans = CalculatePower(power, number);
        System.out.print(ans);
    }
}
