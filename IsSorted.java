public class IsSorted {

    public static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]< arr[index+1]){
            // array is sorted till now
            return isSorted(arr, index+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        int arr[] = {0, 7, 5};
        System.out.println(isSorted(arr, 0));
    }
}
