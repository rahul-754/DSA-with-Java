import java.util.*;
public class subsequences {
    public static void subseq(int idx,int arr[],ArrayList<Integer> al){
        //base case
        if(idx==arr.length){
            System.out.println(al);
            idx=0;
            return ;
        }
        //do the possible operations on the indexes
        al.add(arr[idx]);
        subseq(idx+1, arr, al);
        al.remove(al.size()-1);
        subseq(idx+1, arr, al);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<Integer> al = new ArrayList<>();
        subseq(0, arr, al);
    }
}
