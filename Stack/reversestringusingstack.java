import java.util.*;
public class reversestringusingstack {
    public static void main(String[] args) {
        String str="abc";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
