class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        {
            return null;
        }
        if(p.val > q.val)
        {
            return lowestCommonAncestor(root , q , p);
        }
        if(root.val >= p.val && root.val <= q.val)
        {
            return root;
        }
        else if(root.val < p.val)
        {
            return lowestCommonAncestor(root.right , p , q);
        }
        else
        {
            return lowestCommonAncestor(root.left , p , q);
        }
    }
}
