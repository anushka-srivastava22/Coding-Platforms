class Solution 
{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null){
            return output;
        }
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);
        while (!myQueue.isEmpty()){
            int n = myQueue.size();
            List<Integer> toAdd = new ArrayList<>();
            for (int i = 0; i < n; i++){
                TreeNode temp = myQueue.remove();
                toAdd.add(temp.val);
                if (temp.left != null){
                    myQueue.add(temp.left);
                }
                if (temp.right != null){
                    myQueue.add(temp.right);
                }
            }
            output.add(toAdd);
        }
        return output;
    }
}
