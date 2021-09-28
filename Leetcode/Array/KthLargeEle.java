class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0)
        {
            return -1;
        }
        int result = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : nums)
        {
            pQ.add(n);
        }
        for(int i=1;i<=k;i++)
        {
            result = pQ.poll();
        }
        return result;
    }
}
