 class Solution {
	public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int freq[] = new int[n+1];
        for(int ele : nums){
            if(ele > 0 && ele <= n)
                freq[ele]++;
        }
        for(int i=1;i<freq.length;i++)
            if(freq[i]<1)
                return i;
        return n+1;
    }
}
