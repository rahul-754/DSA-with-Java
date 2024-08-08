import javax.swing.text.AbstractDocument.LeafElement;

public class countnodes {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int ln = count(root.left);
        int rn = count(root.right);
        return ln+rn+1;
    }
    public static int sumofnodes(Node root){
        if(root==null){
            return 0;
        }
       int leftsum=sumofnodes(root.left);
       int rightsum = sumofnodes(root.right);
       return leftsum+rightsum+root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
         root.right = new Node(3);
         root.left.left=new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
        //  System.out.println(count(root));
         System.out.println(count(root));
    }
}
