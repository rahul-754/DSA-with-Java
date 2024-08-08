

public class linkedliststack {
    public static class Node{
        int data;
         static Node next;

        public Node(int data){
            this.data = data;
            Node.next = null;
        }
    }
    public static class Stack{
        public static Node head=null;
        public Boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            Node newNode=new Node(data);
            Node.next=head;
            head=newNode;
        }
        public void pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return;
            }
            head=head.next;
        }
        public int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
           Stack st = new Stack();
           st.push(1);
           st.push(2);
           st.push(3);
           st.push(4);
           System.out.println(st.peek());
           while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
           }
    }
}
