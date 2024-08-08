import java.util.Scanner;

public class binarysearch {
    public static int search(int number[],int key){
        int start=0,end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==number[mid]){
                return mid;
            }
            else if(key>number[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]= new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Enter elements to the array : ");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the key value to search : ");
        int key=sc.nextInt();
        search(number,key);
    }
}
