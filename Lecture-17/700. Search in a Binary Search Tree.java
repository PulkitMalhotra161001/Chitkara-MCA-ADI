public TreeNode searchBST(TreeNode root, int val) {
      if(root==null || root.val==val)  return root;
      else if(val<root.val)  return searchBST(root.left,val);
      return searchBST(root.right,val);
  }
