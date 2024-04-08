class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)  return null;
        
        if(key<root.val){
            root.left = deleteNode(root.left,key);
        }else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        
        //node found
        else{
            
            //no child
            if(root.left==null && root.right==null) return null;
            
            //one child
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            
            //two child
            TreeNode gr = findSuccessor(root.right);
            root.val = gr.val;
            
            //delete the put value
            root.right = deleteNode(root.right,gr.val);
        }
        
        
        return root;
    }
    //just greater value
    TreeNode findSuccessor(TreeNode root){
        while(root.left!=null)  root=root.left;
        return root;
    }
}
