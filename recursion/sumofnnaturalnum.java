import java.util.*;
public class sumofnnaturalnum{
    public static int calsum(int n){
            if(n==1){
                return 1;
            }
            int sum1=calsum(n-1);
            return n+sum1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println((n*(n+1))/2);
       System.out.println(calsum(n));
    }
}