package java_programing.dp_sereis;

import java.util.Scanner;

public class n_stairs {
    public static int stairs(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int left= stairs(n-1);
        int right = stairs(n-2);
        return left+right;
    }
    public static void main(String[] args) {
        System.out.println(10);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int dp[] = new int[n + 1]; 
    dp[0] = 1; 
    dp[1] = 1; 

    for (int i = 2; i <= n; i++) 
        dp[i] = dp[i - 1] + dp[i - 2]; 
   System.out.println(dp[n]);
}
}
