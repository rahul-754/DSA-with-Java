
import java.util.*;
import java.lang.*;
public class duplicateparanthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                int count=0;
                while(!s.empty() && s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1) {
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(str.charAt(i));
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str ="(a+b)";
       System.out.println( isValid(str));
    }
}
 