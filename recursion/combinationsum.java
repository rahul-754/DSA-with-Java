import java.util.ArrayList;

public class combinationsum {
    public static void sum(int idx,int target,int arr[],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds,int n){
        if(idx==n){
            if(target==0){
                ans.add(new ArrayList<>());

            }
            return;
        }
        if(target>=arr[idx]){
        ds.add(arr[idx]);
        sum(idx, target-arr[idx], arr, ans,ds, n);
        ds.remove(ds.size()-1);
        }
        sum(idx+1, target, arr,ans, ds, n);

    }
    public static void main(String[] args) {
        int n=4;
        int arr[] = {2,3,6,7};
        int target=7;
       ArrayList< ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<Integer>();
        sum(0, target, arr,ans, ds, n);
    }
}
