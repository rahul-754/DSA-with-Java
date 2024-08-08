import java.util.Scanner;

public class kadanesum {
    public static void kadan(int numbers[]){
        int cs=Integer.MIN_VALUE;
        int ms=0;
        for(int i=0;i<numbers.length;i++)
        {
            cs=cs+numbers[i];
            if(numbers[i]<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("The maximum sum is : "+ms);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter elements to the array : ");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        kadan(numbers);
    }
}
