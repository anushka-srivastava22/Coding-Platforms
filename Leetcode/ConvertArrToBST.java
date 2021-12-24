class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums , 0 , nums.length - 1);
            
    }
    private TreeNode createTree(int[] nums , int low , int high)
    {
        if(low > high)
        {
            return null;
        }
        int mid = low + (high-low) /2;
        return new TreeNode (nums[mid],createTree(nums,low,mid-1),createTree(nums,mid+1,high)); 
    }
}
