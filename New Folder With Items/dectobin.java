// import java.util.*;
// class dectobin{
//     public static void dectobinnum( int decnum){
//         int pow=0;
//         int binnum=0;
//         while(decnum>0){
//             int rem=decnum%2;
//             binnum=binnum+(rem*(int)Math.pow(10,pow));
//             pow++;
//             decnum=decnum/2;
//         }
//         System.out.println(binnum);
        
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int decnum = sc.nextInt();
//         dectobinnum(decnum);
//     }
// }
import java.util.*;
class dectobin{
    public static void dectobinnum( int decnum){
        int pow=0;
        int binnum=0;
        while(decnum>0){
            int rem=decnum%2;
            binnum=binnum+(rem*(int)Math.pow(10,pow));
            pow++;
            decnum=decnum/2;
        }
       // System.out.println(binnum);
       String str=Integer.toString(binnum);
       int n=str.length();
      // System.out.println(n);
      int count=0;
      for(int i=0;i<n;i++){
        if(str.charAt(i)=='1'){
            count++;        }
      }
      System.out.println(count);
       for(int i=0;i<n;i++){
        if(str.charAt(i)=='1'){
            System.out.println(i+1);
        }
       }
    //    int arr[]=new int[n];
    //    while(binnum>0){
    //        int rem=binnum%10;
    //        binnum=binnum/10;
    //        for(int i=n-1;i>0;i++){
    //            arr[i]=rem;
    //            if(arr[i]==1){
    //                System.out.println(i);
    //            }
    //        }
           
    //    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int decnum = sc.nextInt();
        dectobinnum(decnum);
      //  System.out.println(decnum);
        
    }
}
