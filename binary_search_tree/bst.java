import java.util.*;

public class bst {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node biuldBst(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
           root.left = biuldBst(root.left,val);
        }
        if(root.data<val){
          root.right = biuldBst(root.right,val);
        }
        return root;
    }
    public static boolean search(Node root,int a){
        if(root==null) return false;
        if(root.data==a){
            return true;
        }
        if(root.data>a){
            return search(root.left,a);
        }
        else{
            return search(root.right,a);
        }
        //return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = null;
        for(int i = 0 ; i<n; i++){
            root = biuldBst(root,arr[i]);
        }
        System.out.println(search(root, 3));
    }
}
