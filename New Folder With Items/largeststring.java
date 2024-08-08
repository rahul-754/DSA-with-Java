import java.util.*;
public class largeststring {
    public static void largest(String str[]){
        String largest=str[0];
        for(int i=1;i<str.length;i++){
                if(largest.compareTo(str[i])<0){
                    largest=str[i];
                }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
       
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        largest(str);
    }
}
