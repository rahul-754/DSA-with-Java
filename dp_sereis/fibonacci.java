package dp_sereis;
import java.util.*;
public class fibonacci{
    // recursive approach
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = 5;
      //  System.out.println(fib(n));
        //dp approach
        int arr[] = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}