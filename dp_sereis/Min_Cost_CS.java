package java_programing.dp_sereis;

import java.util.ArrayList;
import java.util.Scanner;

public class Min_Cost_CS {
    public int solve(int n,int dp[],ArrayList<Integer> ar){
        if(n==1 || n==0)
        return 1;
        if(dp[n]!=-1)
        return dp[n];
        return dp[n]=solve(n-1,dp,ar)+solve(n-2,dp,ar);
    }
    public static void main(String[] args) {
        int cost[] = {10,15,20};
        ArrayList<Integer> ar = new ArrayList<>();

    }
}
