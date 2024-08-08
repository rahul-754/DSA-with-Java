import java.util.*;
public class bubblesort {
    public static void bubble(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void selectionsort(int array[]){
        for(int i=0;i<array.length;i++){
            int minpos=i;
            for(int j=i+1;j<array.length;j++){
                if(array[minpos]>array[j]){
                    minpos=j;
                }
            }
            int temp=array[minpos];
            array[minpos]=array[i];
            array[i]=temp;
        }
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }     

    }
    public static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){
            int curr=array[i];
            int prev=i-1;
            //lets findout the corrct position 
            while(prev>=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;
            }
            // insert the element at their specified position
            array[prev+1]=curr;
        }
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }    
    }
    public static void inbuiltsort(int array[]){
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int array[] = {15,10,14,12};
        inbuiltsort(array);
        }
}
