package dp_sereis;

import java.util.Scanner;

public class LCS {
    public static int generate(int idx,int idx1,String str, String temp,String ans){
        if(idx<0 || idx1<0)
        return 0;
        if(str.charAt(idx)==temp.charAt(idx1)){
            ans+=str.charAt(idx);
            return 1+generate(idx-1, idx1-1, str, temp,ans);
        }
        return 0+Math.max(generate(idx, idx1-1, str, temp,ans),generate(idx-1, idx1, str, temp,ans));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp=sc.nextLine();
        int n=str.length();
        int m=temp.length();
        String ans="";
        System.out.println(generate(n-1,m-1, str, temp,ans));
        System.out.println(ans);
    }
}
