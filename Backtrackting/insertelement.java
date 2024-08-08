import javax.swing.event.ChangeEvent;

public class insertelement{
    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            return;
        }
        arr[i]=val;
        changearr(arr, i+1, val+1);//calling the function recursivly you can can backtrack after calling the fuction only
        arr[i]=arr[i]-2; //backtracking is happening
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
  
    public static void main(String[] args) {
        int arr[]= new int[5];
        changearr(arr, 0, 0);
        printArr(arr);
    }
}