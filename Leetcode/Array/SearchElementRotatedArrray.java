class Solution {
    public int findMin(int[] nums) {
        int l = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<l;i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        return min;
    }
}
