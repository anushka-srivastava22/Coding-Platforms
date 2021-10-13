class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, 0, preorder.length-1);
    }
    public TreeNode bstFromPreorder(int[] pre, int start, int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return new TreeNode(pre[start], null, null);
        }
        int currValue = pre[start];//
        TreeNode curr= new TreeNode(currValue); //create the node
        int mid= start;
		//we have to divide the array into two parts say left_arry and right_array. left_array will contains 
		//all the value less than currValue, right_array will have values greater than currValue.
        while(mid < pre.length && pre[mid] <= currValue){
            mid++;
        }
        curr.left= bstFromPreorder(pre, start+1, mid-1);
        curr.right= bstFromPreorder(pre, mid, end);
        return curr;
    }
}
