import java.util.random.RandomGenerator.LeapableGenerator;

public class minimum_possible_distance {
    public static class Node{
            int data;
            Node left;
            Node right;
        public Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node secondapproachllca(Node root,int n1,int n2){
        if(root==null || root.data ==n1 || root.data==n2){
            return root;
        }
        Node leftlowest = secondapproachllca(root.left, n1, n2);
        Node rightlowest = secondapproachllca(root.right, n1, n2);
    
        if(leftlowest==null){
            return rightlowest;
        }
        if(rightlowest == null){
            return leftlowest;
        }
        return root;
    }
    
    public static int dist(Node root,int n){
        if(root==null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }
        int left=dist(root.left, n);
        int right = dist(root.right ,n);
        if(left==-1 && right==-1){
            return -1;
        }
        else if(left == -1){
            return right+1;
        }
        else{
            return left+1;
        }

    }


    public static int mindis(Node root,int n1, int n2){
        Node lca = secondapproachllca(root, n1, n2);

        int leftdist=dist(lca,n1);
        int rightdist = dist(lca,n2);

        return leftdist+rightdist;
    }
    public static void main(String[] args) {
        Node root  = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(mindis(root,4,6));
    }
}
