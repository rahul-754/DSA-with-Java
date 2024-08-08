import java.util.*;
public class reverse {
    public static void resursion(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        resursion(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        resursion(n);
    }
}
