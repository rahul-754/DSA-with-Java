public class searchinsortedandrotatedarr {
    public static int searchtarget(int arr[],int tar,int si,int ei){
        int mid=(si+ei)/2;
        if(arr[mid]==tar){
            return mid;
        }
        //if target value is on first line
        if(arr[si]<=arr[mid]){
        if(tar>=arr[si] && tar<=arr[mid]){
            return searchtarget(arr, tar, si, mid);
        }
        else{
            return searchtarget(arr, tar, mid+1, ei);
        }
    }
    else{
        if(arr[mid]<=tar && tar<=arr[ei]){
            return searchtarget(arr, tar, mid, ei);
        }
        else{
            return searchtarget(arr, tar, si, mid-1);
        }
    }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(searchtarget(arr, 0, 0,arr.length-1));
    }
}
