class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int M = nums1.length;
        int N = nums2.length;
        int i, j;
        
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for(i = 0; i < N; i++){
            indexMap.put(nums2[i], i);
        }
        
        int[] next = new int[N];
        Arrays.fill(next, -1);
        
        Stack<Integer> stack = new Stack<Integer>();
        for(i = 0; i < N; i++){
            while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]){
                next[stack.pop()] = i;
            }
            
            stack.push(i);
        }
        
        int[] result = new int[M];
        for(i = 0; i < M; i++){
            j = next[indexMap.get(nums1[i])];
            if(j == -1)
                result[i] = -1;
            else
                result[i] = nums2[j];
        }
        
        return result;
    }
}
