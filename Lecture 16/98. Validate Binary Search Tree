/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
TC: O(N)
SC: O(N)
class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        check(root, ans);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i-1) >= ans.get(i)){
                return false;
            }
        }
        return true;
    }
    public void check(TreeNode root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        check(root.left, ans);
        ans.add(root.val);
        check(root.right, ans);
    }
}
TC: O(N)
SC: O(1)
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))return true;
        return  check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean check(TreeNode root, long min, long max){
        if(root == null)return true;
        if(root.val >= max || root.val <= min){
            return false;
        }
        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }
}
