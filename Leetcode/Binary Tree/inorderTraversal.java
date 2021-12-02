class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root , res);
        return res;
        
    }
    public static void inorder (TreeNode root , List<Integer> res)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left , res);
        res.add(root.val);
        inorder(root.right , res);
    }
}
