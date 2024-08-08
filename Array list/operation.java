import java.util.ArrayList;
import java.util.Scanner;

public class operation{
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            List.add(v);
        }
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+" ");
        }
        
    }
}