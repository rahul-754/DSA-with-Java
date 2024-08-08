import java.util.ArrayList;

import java.util.ArrayList;
public class arrayliststack{
    public static class Stack{
         ArrayList<Integer> stk= new ArrayList<>();
        public boolean isEmpty(){
           return stk.size()==0;
        }
        public void push(int data){
            stk.add(data);
        }
        public void pop(){
            stk.remove(stk.size()-1);
        }
        public int peek(){
            return stk.get(stk.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack ss=new Stack();
        ss.push(5);
        ss.push(6);
        ss.push(7);
        ss.push(8);

        while(!ss.isEmpty()){
            System.out.println(ss.peek());
           ss.pop();;
        }


    }
}