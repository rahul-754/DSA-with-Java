
import java.util.*;
public class Main {
    public static boolean check(String str,String com){
        int i=0,j=0;
        while(i<str.length() && j<com.length()){
            System.out.println(str.charAt(i)+" "+com.charAt(j)+" "+i+" "+j);
            if(str.charAt(i)!=com.charAt(j))
            j++;
            else
            i++;
        }
        if(i==str.length())
        return true;
        
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        String com = sc.next();
        boolean a = check(str1, com);
        boolean b = check(str, com);
        if(a==true && b==true)
        System.out.println("True");
        else
        System.out.println("False");
    }
}
