class Solution {
    public int trap(int[] arr) {
        int res = 0;
    int n=arr.length;
    // For every element of the array
    // except first and last element
    for(int i = 1; i < n - 1; i++)
    {
         
        // Find maximum element on its left
        int left = arr[i];
        for(int j = 0; j < i; j++)
        {
            left = Math.max(left, arr[j]);
        }
 
        // Find maximum element on its right
        int right = arr[i];
        for(int j = i + 1; j < n; j++)
        {
            right = Math.max(right, arr[j]);
        }
 
        // Update maximum water value
        res += Math.min(left, right) - arr[i];
    }
    return res;
    }
}
