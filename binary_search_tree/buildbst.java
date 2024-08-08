import java.util.ArrayList;

import org.w3c.dom.Node;

public class buildbst{
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    //delete a node from the binary search tree

    public static Node delete(Node root,int val){
        
        if(root.data<val){
            return root.left;
        }
        else if(root.data>val){
            return root.right;
        }

        else{
        //for the leaf nodes
        if(root.left==null && root.right==null){
            return null;
        }
        //now delete for the single nodes
        //for the nodes whose left node is null
       if(root.left==null){
            return root.right;
        }
        // for the nodes whose right node is null
      else if(root.right==null){
        return root.left;
       }

       // for the node who is having both the child nodes left and right

       Node IS = Issuccessor(root.right);

       root.data = IS.data;
        root.right = delete(root.right,IS.data);
    }
    return root;
    }

    public static Node Issuccessor(Node root){
        if(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void printpath(Node root,ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void roottoleaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right==null){
            printpath(root,path);
        }
        roottoleaf(root.left, path);
        roottoleaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isbst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<= min.data){
            return false;
        }
        else if(max!=null && root.data >=max.data){
            return false;
        }

        return isbst(root.left, min, max) && isbst(root.right, min, max);
    }

    public static Node mirrorbst(Node root){
        if(root==null){
            return null;
        }

        Node lefts=mirrorbst(root.left);
        Node rights=mirrorbst(root.right);

        root.left =rights;
        root.right=lefts;

        return root;
    }

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);
    }

    // public static void creatbst(ArrayList<Integer> path,int st,int end){
    //    if(st>end){
    //     return ;
    //    }
    //    int mid = (st+end)/2;
    //    Node root = new Node(path.get(mid));
    //    root.left = creatbst(path, st, mid-1);
    //   root.right creatbst(path, mid+1, end);


    // }
    public static void main(String[] args) {
        int arr [] = {8,5,3,6,10,11};
        Node root = null;

        for(int i =0;i<arr.length;i++){
            root = insert(root, arr[i]);
        }
        // inorder(root);
        // System.out.println();
        // root = delete(root, 1);
        // System.out.println();
        // inorder(root);

        // roottoleaf(root,new ArrayList<>());

        // System.out.println(isbst(root, null, null));

        Node root1=mirrorbst(root);
        preorder(root1);

    }
}