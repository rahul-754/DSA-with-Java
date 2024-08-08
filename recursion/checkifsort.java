public class checkifsort {
    public static boolean Sort(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Sort(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,4,6};
       System.out.println( Sort(arr, 0) );
    }
}
