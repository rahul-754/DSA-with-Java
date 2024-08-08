import java.util.* ;
import java.io.*; 
public class nstairs {
    public static int solve(int nStairs,int i, ArrayList<Integer> ar){
    
        if(i==nStairs){
            System.out.println(ar);
            ar.clear();
            return 1;
        }
        if(i>nStairs)
        return 0;
        ar.add(i);
        return solve(nStairs, i+1,ar) + solve(nStairs, i+2,ar);

    }
	
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println(solve(3, 0,ar));
    }
	}
