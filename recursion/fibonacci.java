import java.util.Scanner;

public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            System.out.println(n);
            return n;

        }
        int sum1 =   fib(n-2);
        int sum2 = fib(n-1);
        return sum1+sum2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
