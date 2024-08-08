import java.util.Scanner;

public class maxsumofsubarray {
    public static void sum(int numbers[]){
        int sum=0;
        int curr=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    // System.out.print(numbers[k]+ " ");
                        sum=sum+k;
                }

                System.out.println(sum);
            }
            if(sum>curr){
                curr=sum;
            }
            System.out.println();
        }
        System.out.println("Highest sum is : "+curr);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array : ");
            int n=sc.nextInt();
            int numbers[]=new int[n];
            System.out.println("Enter elements to the array : ");
            for(int i=0;i<n;i++){
                numbers[i]=sc.nextInt();
            }
            sum(numbers);
        }
}
