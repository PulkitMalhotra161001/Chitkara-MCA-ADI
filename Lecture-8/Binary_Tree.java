public class Binary_Tree {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(7);
        
        tree.left.left = new Node(9);
        tree.left.right = new Node(6);
        
        tree.left.right.left = new Node(7);
        tree.left.right.right = new Node(8);
        
        System.out.print("InOrder: ");
        inOrder(tree);
        System.out.println();
        
        System.out.print("PreOrder: ");
        preOrder(tree);
        System.out.println();
        
        System.out.print("PostOrder: ");
        postOrder(tree);
        System.out.println();
        
        System.out.print("leafNode: ");
        leafNode(tree);
        System.out.println();
        
        
        
    }
    static void preOrder(Node node){
        //base Case
        if(node==null)  return;
        
        //node
        System.out.print(node.val+" ");
        
        //left
        preOrder(node.left);
        
        //right
        preOrder(node.right);
    }
    
    static void leafNode(Node node){
        //base Case
        if(node==null)  return;
        
        //node
        if(node.left==null && node.right==null)
            System.out.print(node.val+" ");
        
        //left
        leafNode(node.left);
        
        //right
        leafNode(node.right);
    }
    
    static void postOrder(Node node){
        //base Case
        if(node==null)  return;
        
        //left
        postOrder(node.left);
        
        //right
        postOrder(node.right);
        
        //node
        System.out.print(node.val+" ");
    }
    
    static void inOrder(Node node){
        //base Case
        if(node==null)  return;
        
        //left
        inOrder(node.left);
        
        //node
        System.out.print(node.val+" ");
        
        //right
        inOrder(node.right);
    }
}

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val = val;
        left=null;
        right=null;
    }
}