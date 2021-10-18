class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        //stack to push indexes

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty()) {
                // that means no element to the left, put it as 0
                left[i] = 0;
                stack.push(i);
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                    //keep popping the elements till the smaller element is reached
                    stack.pop();
                }
                //if stack is empty no smaller element to the left
                left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
                stack.push(i);
            }
        }
        //clear the stack
        stack.clear();

        // similarly for right
        for (int i = heights.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                // that means no element to the right, put it as height.length - 1
                right[i] = heights.length - 1;
                stack.push(i);
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                    //keep popping the elements till the smaller element is reached
                    stack.pop();
                }
                //if stack is empty no smaller element to the right then assign height.length,
                // otherwise peek of stack - 1;
                right[i] = stack.isEmpty() ? heights.length - 1 : stack.peek() - 1;
                stack.push(i);
            }
        }

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int area = heights[i] * (right[i] - left[i] + 1);
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
	}    
    
}
