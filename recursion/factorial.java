import java.util.Scanner;

public class factorial {
    public static int fact(int  n){
        if(n==1){
            return 1;
        }
        int sum1=fact(n-1);
        int ml = n * sum1;
        return ml;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( fact(n));
    }
}
