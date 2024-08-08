import java.util.LinkedList;
import java.util.Queue;

public class buildtree{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.left=null;
        }
    }
    public static class buildbinarytree{
        static int idx=-1;
        public Node btree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node NewNode = new Node(nodes[idx]);
            NewNode.left=btree(nodes);
            NewNode.right=btree(nodes);

            return NewNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+"->");
            preorder(root.left);
            preorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){return;}
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"->");
        }
        public static void inorder(Node root){
            if(root== null){
                return;
            }
            postorder(root.left);
            System.out.print(root.data+"->");
            postorder(root.right);
        }
        public void levelordertraversal(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q = new LinkedList();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                        System.out.print(currNode.data+" ");
                        if(currNode.left!=null){
                            q.add(currNode.left);
                        }
                        if(currNode.right!=null){
                            q.add(currNode.right);
                        }
                }
            }
        }
        public int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            int res=Math.max(lh, rh);
            return res+1;
        }
        public int noofnodes(Node root){
            if(root==null){
                return 0;
            }
            int lh=noofnodes(root.left);
            int rh=noofnodes(root.right);
            return lh+rh+1;
            
        }
        public int sum1(Node root){
            if(root==null){
                return 0;
            }
            int lh=sum1(root.left);
            int rh=sum1(root.right);
            return lh+rh+root.data;
            
        }
        //here time complexity is more in this aproach O(n square)
        public int diameteroftree(Node root){
            if(root==null){
                return 0;
            }
            int ld=diameteroftree(root.left);
            int lh=height(root.left);
            int rd = diameteroftree(root.right);
            int rh = diameteroftree(root.right);

            int selfdiameter=lh+rh+1;
            return Math.max(selfdiameter,Math.max(ld, rd));
        }
    }
       static class Info{
            // public static char[] data;
            int daim;
            int ht;
            public Info(int diam,int ht){
                this.daim=diam;
                this.ht=ht;
            }
        }
        public static Info diameter(Node root){
            if(root==null){
                return new Info(0, 0);
            }

            Info leftInfo=diameter(root.left);
            Info righInfo=diameter(root.right);
            
            int diam=Math.max(Math.max(leftInfo.daim, righInfo.daim), leftInfo.ht+righInfo.ht+1);
            int ht = Math.max(leftInfo.ht,righInfo.ht)+1;
            return  new Info(diam,ht);
        }
        public static boolean isIdentical(Node node, Node subroot){
            if(node==null && subroot==null){
                return true;
            }
            else if(node==null || subroot==null || node.data!=subroot.data)
            {
                return false;
            }
            if(!isIdentical(node.left, subroot.left)){
                return false;
            }
            if(!isIdentical(node.right, subroot.right)){
                return false;
            }
            return true;
        }
        public static boolean issubroot(Node root,Node subroot){
            if(root==null) return false;
            if(root.data == subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            // boolean leftans=issubroot(root.left, subroot);
            // boolean rightans=issubroot(root.right, subroot);
            // return leftans || rightans;
            return issubroot(root.left, subroot) || issubroot(root.right, subroot);
        }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       buildbinarytree bt = new buildbinarytree();
        Node root=bt.btree(nodes);
        System.out.println(root.data);
    //    buildtree.buildbinarytree.preorder(root);
    //    System.out.println();
    //     buildtree.buildbinarytree.postorder(root);
    //     System.out.println();
    //     buildtree.buildbinarytree.inorder(root);
    //     System.out.println();
       // bt.levelordertraversal(root);
        // System.out.println(bt.height(root));
        // System.out.println(bt.noofnodes(root));
        // Node root = new Node(1);
        // root.left =new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        /*       1
                / \
               2   3
              / \  / \
             4   5 6  7
         */

         //subroot
         /*
          *  2
            / \
           4   5
//           */
//           Node subroot = new Node(2);
//           subroot.left = new Node(4);
//           subroot.right = new Node(5);
// System.out.println(issubroot(root, subroot));
     //   System.out.println(diameter(root).ht);
    }
    // private static Object diameter(buildtree.Node root) {
    //     return null;
    // }
}    