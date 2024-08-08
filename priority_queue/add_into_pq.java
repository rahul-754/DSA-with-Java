import java.util.ArrayList;

public class add_into_pq{
    public static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            //adding at the last index
            arr.add(data);
            int x = arr.size()-1; //x is the child index
            int par=(x-1)/2; // parent node index by arrays properties for heaps  -- 
            while(arr.get(x)<arr.get(par)){
                //swape
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }

    }
    public static void main(String[] args) {
        
    }
}