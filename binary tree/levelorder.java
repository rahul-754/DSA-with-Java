import java.io.*;
import java.util.*;
import java.math.*;

public class levelorder {
     static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
         if (data <= root.data) { 
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }
    public static void levelorder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node a=q.remove();
            if(a==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(a.data);
                if(a.left!=null){
                    q.add(a.left);
                }
                if(a.right!=null){
                    q.add(a.right);
                }
            }
        }

    }

    public static int heighttree(Node root){
        if(root==null) return 0;
        int l=heighttree(root.left);
        int r=heighttree(root.right);
        return Math.max(l,r)+1;
    }
    public static int noofnodes(Node root){
        if(root==null) return 0;
        int c=1;
        int l=noofnodes(root.left);
        int r=noofnodes(root.right);
        return l+r+1;
    }
  static  int sum=0;
    public static int sumnodes(Node root){
    //int sum=0;
        if(root==null) return 0;
        sumnodes(root.left);
        sum+=root.data;
        sumnodes(root.right);
        return sum;

    }
    public static int diameter(Node root){
        if(root==null) return 0;
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int lh=heighttree(root.left);
        int rh=heighttree(root.right);
        int s=lh+rh+1;
        return Math.max(ld,Math.max(rd,s));
    }
    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null) return true;
        else if(node==null || subRoot==null || node.data!=subRoot.data) return false;
        else if(isIdentical(node.left, subRoot.left)) return false;
        else if(isIdentical(node.right, subRoot.right)) return false;
        return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            Node root=null;
            for(int i=0;i<n;i++){
                root=insert(root,b[i]);
            }
            int m=sc.nextInt();
            int c[]=new int[m];
            //levelorder(root);
            //System.out.println(heighttree(root)-1);
            //System.out.println(noofnodes(root));
            //System.out.println(sumnodes(root));
            //System.out.println(diameter(root));
            for(int i=0;i<m;i++){
                c[i]=sc.nextInt();
            }
            Node subroot=null;
            for(int i=0;i<m;i++){
                subroot=insert(root,c[i]);
            }
            System.out.println(isSubtree(root, subroot));
        }
    }
}