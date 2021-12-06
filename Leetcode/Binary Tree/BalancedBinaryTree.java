class Solution {
    public static int maxHeight(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int l = maxHeight(root.left) + 1;
        int r = maxHeight(root.right) + 1;
        return Math.max(l , r);
    }
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
        {
            return true;
            
        }
        if(Math.abs(maxHeight(root.left) - maxHeight(root.right)) > 1)
        {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
