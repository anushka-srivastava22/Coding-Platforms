class Solution {
    List<Integer> list ;
    public int minDiffInBST(TreeNode root) {
         
        list = new ArrayList<>();
        inorder(root);
     
        int max = Integer.MAX_VALUE;
        for(int i = 0 ; i <list.size()-1; i++){
            if(list.get(i+1) - list.get(i) < max){
                max = list.get(i+1) - list.get(i);
            }
        }
        return max;
    }
	
    public void inorder(TreeNode root){
        if(root == null){
            return ;
        }
		
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
