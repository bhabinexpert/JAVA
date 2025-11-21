public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, helper, dest);
        System.out.println("Transfer disk " + n + "from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        // only one disk transferred in 1 step
        // smaller disks are always kept on the top of larger disks
        int n = 3;
        towerOfHanoi(n, "src", "helper", "dest");

    }
}
