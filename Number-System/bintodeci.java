// import java.util.*;
// import java.math.*;
// class bintodeci{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int binnum=sc.nextInt();
//         int sum=0;
//         while(binnum>0){
//             int i=0;
//             int rem=binnum%10;
//             sum=sum+rem*(int)Math.pow(2,i);
//             i++;
//             binnum=binnum/10;
//         }
//         System.out.println(sum);
//     }
// }
import java.util.*;
import java.math.*;
class bintodeci{
    public static void bintodec(int binnum){
          int pow=0;
        int decnum=0;
        int temp=binnum;
        while(binnum>0){
            int lastdigit=binnum%10;
            decnum=decnum + (lastdigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("The decimal form of " + temp + " is = "+ decnum);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int binnum=sc.nextInt();
        bintodec(binnum);
    }
}  