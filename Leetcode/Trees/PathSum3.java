class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        
        return pathSum(root.left, targetSum) + pathSum(root.right, targetSum) + helper(root, 0, targetSum);
    }
    
    int helper(TreeNode root, int current, int target) {
        if(root == null)
            return 0;
        
        current += root.val;
        
        return (current == target ? 1 : 0) + helper(root.left, current, target) + helper(root.right, current, target);
    }
}
