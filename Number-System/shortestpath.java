import java.util.*;
import java.math.*;
public class shortestpath {
    public static void shortestpath1(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
        }
        System.out.println("("+x+","+y+")");
        int value1=x*x;
        int value2=y*y;
        int value3=value1+value2;
        double finalans=Math.sqrt(value3);
        System.out.println("The shortest is : "+finalans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        shortestpath1(str);
    }
}
