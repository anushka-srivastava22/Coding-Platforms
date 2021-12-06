class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
     List<Integer> res =new ArrayList<>();
        postorder(root , res);
        return res;
    }
    public static void postorder(TreeNode root , List<Integer> res)
    {
        if(root == null)
        {
            return;
        }
        
        postorder(root.left , res);
        postorder(root.right , res);
        res.add(root.val);
    }
}
