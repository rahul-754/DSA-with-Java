import java.util.ArrayList;

public class merge_two_bst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node arrtobst(ArrayList<Integer> arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = arrtobst(arr, start, mid-1);
        root.right = arrtobst(arr, mid+1, end);

        return root;
    }

    public static void getinorder(Node root, ArrayList<Integer> list ){
        if(root == null) {
            return;
        }

        getinorder(root.left, list);
        list.add(root.data);
        getinorder(root.right, list);
    }

    public static Node merge(Node root1,Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        getinorder(root1,arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getinorder(root2, arr2);
        ArrayList<Integer> finalarr = new ArrayList<>();
        int i =0,j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)) {
                 finalarr.add(arr1.get(i));
                 i++;
        }
        else{
            finalarr.add(arr2.get(j));
            j++;
        } 
    }
    while(i<arr1.size()){
        finalarr.add(arr1.get(i));
        i++;
    }
    while(j<arr2.size()){
        finalarr.add(arr2.get(j));
        j++;
    }
    return arrtobst(finalarr, 0, finalarr.size()-1);
}

public static void inorder(Node root){
    if(root == null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}


    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right=new Node(3);


        Node root2 = new Node(9);
        root2.left = new Node(4);
        root2.right = new Node(12);

        Node root = merge(root1, root2);
        inorder(root);

    }
}
