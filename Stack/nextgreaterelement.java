import java.util.*;
public class nextgreaterelement{
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s = new Stack<>();

        int nextgreater []=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]<arr[i]){
                System.out.println(s.pop());
                s.pop();
                
            }
            if(s.isEmpty()){
                nextgreater[i]=-1;
                System.out.println(nextgreater[i]);
            }
            else{
                nextgreater[i]=arr[s.peek()];
                System.out.println("else"+nextgreater[i]);
            }
            s.push(i);
            System.out.println("push"+s.push(i));
        }
        System.out.println("outputs :: ....");
        for(int i=0;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }

        //next greater right
        //next greater left
        //next smaller right
        //next smaller left
    }
}