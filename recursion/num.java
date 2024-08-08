import java.util.Scanner;
public class num{
    public static void prints(int i, int n){
        if(i<1){
            return;
        }
        prints(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        prints(n, n);
    }
}