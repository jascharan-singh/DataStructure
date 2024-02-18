import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val); // Corrected line
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }
    public static void inOrder( Node root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static int countOfNodes(Node root){

        if (root == null){return 0;}

        int leftC = countOfNodes(root.left);
        int rightC = countOfNodes(root.right);
        return leftC+rightC+1;
    }
    public static int sumOfNOde(Node root){
        if (root == null){return 0;}

        int left =  sumOfNOde(root.left);
        int right = sumOfNOde(root.right);
        return left + right +root.data;
    }
    public static int height(Node root){
        if (root == null){return 0;}
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int max = Math.max(leftHeight,rightHeight);
        return max +1;
    }
    public static void bfs(Node root){
        if (root == null){return;}
        Queue <Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.println(curr.data);
            if (curr.left != null) {queue.add(curr.left);}
            if (curr.right != null) {queue.add(curr.right);}
            }
        }
    public static boolean searchKey(Node root, int value){
        if (root == null){return false;}
        if (root.data == value){return true;}
        if (value<root.data){
            return  searchKey(root.left, value);
        }
        else {
           return searchKey(root.right, value);
        }

    }
    public static void main(String[] args) {
        int value [] = {5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        //inOrder(root);
//        bfs(root);
//        System.out.println(searchKey(root, 40));
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNOde(root));
        System.out.println(height(root));
    }
}