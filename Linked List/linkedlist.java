public class linkedlist{
   public static class Node{
        int data;
        Node next;

       public Node(int d){
            data=d;
        }
    }
// private final char[] size = null;
    public static Node head;
    public static Node tail;
    public static void addfirst(int data){
        Node Newnode = new Node(data);
        if(head==null){
            head=tail=Newnode;
            return;
        }
            // Node Newnode = new Node(data);
            Newnode.next = head;
            head=Newnode;
    }

    // private char[] size;
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
       // System.out.println(tail.data);
    }

    public static void addlast(int data){
        Node Newnode = new Node(data);
        if(head==null){
            head=tail=Newnode;
            return;
        }
       tail.next=Newnode;
       Newnode.next = null;
    }
    public static  void addnthpos(int data,int pos){
         Node NewNode = new Node(data);
         int count=0;
         Node temp=head;
         while(count!=pos-1){
            count++;
            temp=temp.next;  
         }
         NewNode.next=temp.next;
         temp.next=NewNode;
    }
    // public int removeLast(){
    //     // if(head==null){
    //     //     System.out.println("The linked list is empty");
    //     //     return Integer.MIN_VALUE;
    //     // }
    //     // else if(size==1){
            
    //     // }
    // }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addfirst(52);
        ll.addfirst(552);
        // llSystem.out.println(ll);
        ll.addlast(5);
        ll.addfirst(58);
        ll.addnthpos(9, 2);;
        ll.print();
        

    }
}