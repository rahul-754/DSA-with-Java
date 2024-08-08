// import java.util.*;
// class binomialcoeficient{
//     public static int factorial(int m){
//         int sum=1;
//         for(int i=1;i<m;i++){
//             sum=sum*i;
//         }
//         // System.out.println(sum);
//         return sum;
//     }
//     public static int bc(int n,int r){
//        int a=factorial(n);
//        int b=factorial(r);
//        int c=factorial(n-r);
//        int result=a/(b*c);
//         System.out.println("The Binomial Coefficient is : " + result);
//     return result;
//     }
// public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n : ");
//         int n=sc.nextInt();
//         System.out.println("Enter the value of r : ");
//         int r=sc.nextInt();
//         bc(n,r);
//     }
// }

import java.util.Scanner;

public class binomialcoeficient {
   public static long fact(int i) {
      if(i <= 1) {
         return 1;
      }
      return i * fact(i - 1);
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter n value: ");
     
      int n = sc.nextInt();
      System.out.println("Enter r value: ");
     
      int r = sc.nextInt();
      long ncr = fact(n)/(fact(r)*fact(n-r));
      System.out.println("c("+n+", "+r+") :"+ ncr);
   }
}