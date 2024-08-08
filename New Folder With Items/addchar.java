import java.io.StringReader;
import java.util.Scanner;

public class addchar {
    public static void add(String str){
        for(char ch='a';ch<='z';ch++){
            str+=ch;
            System.out.println(str);
        }

    }
    //By this approach the time complexity will be 26*n 
//now i will try to decrease the time complexity
public static void addsb(StringBuilder str){
    for(char ch='a';ch<='z';ch++){
        str.append(ch);
    }
    System.out.println(str);
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder str=new StringBuilder("rahuln");
        addsb(str);
    }
// public static void main(String[] args) {
//     System.out.println(5&6);


}



