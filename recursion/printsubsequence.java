import java.util.ArrayList;
import java.util.Scanner;

public class printsubsequence {
    public static void subseq(int idx,char arr[],ArrayList<Character> ar,int n){
        if(idx==n){
            for(char i:ar){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        ar.add(arr[idx]);
        subseq(idx+1, arr, ar, n);
        ar.remove(ar.size()-1);
        subseq(idx+1, arr, ar, n);
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.next().charAt(0);
        }
        ArrayList<Character> ar = new ArrayList<>();
        subseq(0, arr,ar, n);
    }
}
