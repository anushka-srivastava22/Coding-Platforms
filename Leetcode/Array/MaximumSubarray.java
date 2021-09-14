class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<l;i++)
        {
            sum = sum + nums[i];
            if(maxsum < sum)
            {
                maxsum = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return maxsum;
    }
}
