class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length<2)
        {
            return nums.length;
        }
        int i=0;//2,3,3,4
        int j=1;
        while(j<nums.length)//4  j<3
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}
