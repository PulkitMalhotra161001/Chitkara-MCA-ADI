class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);
        return res;
    }

    public void postOrder(TreeNode root, List<Integer> res) {
        if(root==null)  return;

        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.val);
    }
}