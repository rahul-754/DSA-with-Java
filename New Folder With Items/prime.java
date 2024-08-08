import java.util.*;
class prime{
    public static void primenum(int n){
        int flag=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                // System.out.println(n +" ");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(n);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        primenum(i);
        }
    }
}