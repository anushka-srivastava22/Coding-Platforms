class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int start = 0;
        int end = length - 1;
        
        int max=0;
        while(start < end)
        {
            int result = (end-start)*Math.min(height[start] , height[end]);
            if(result > max)
            {
                max = result;
            }
            if(height[start] < height[end])
            {
                start++;
            }
            
            else
            {
                end--;
            }
        }
        return max;
    }
}
