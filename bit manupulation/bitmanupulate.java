import java.util.Scanner;

public class bitmanupulate {
    //to get ith bit
    public static int getithbit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    //now for set ith bit
    public static int setithbit(int n,int i){
        // int bitMask=1<<i;
        // if(n/bitMask) {return true;
        
        // return false;
        return (n>>i)&1;
        // return n/bitMask;
    }
    //to clear ithbit
    public static int clearbit(int n, int i){
        int bitMask=~(1<<i);
        return n&bitMask;
        }
    //for update ith bit
    public static int updateithbit(int n,int i,int newbit){
        if(newbit==0)
        return clearbit(n,i );
        else{
           return setithbit(n, i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(setithbit(25,3));
        // System.out.println("Enter any number for operation : ");
        // int n=sc.nextInt();
        // System.out.println("Select any choice : ");
        // System.out.println("1. Get ith bit");
        // System.out.println("2. Set ith bit");
        // System.out.println("3. clear ith bit");
        // System.out.println("4. Update ith bit");
        // System.out.println("5.Exit");
        // int ch=sc.nextInt();
        // System.out.println("Enter ith position where do you want to perform operation : ");
        // int i=sc.nextInt();
        // if (ch>0 && ch<6){
        //     switch(ch){
        //         case 1 : System.out.println("The result is : ");
        //         System.out.println(getithbit(n, i));
        //         break;
        //         case 2 : System.out.println("The result is : ");
        //         System.out.println( setithbit(n, i));
        //         break;
        //         case 3 : System.out.println("The result is : ");
        //         System.out.println(clearbit(n, i));
        //         break;
        //         case 4 : System.out.println("Enter the new bit : ");
        //         int newbit = sc.nextInt();
        //         System.out.println("The result is : ");
        //         System.out.println(updateithbit(n, i, newbit));
        //         break;
        //         case 5: break;
        //     }
        // }
        // else{
        //     System.out.println("Press the valid option : ");
        // }

    }

}
