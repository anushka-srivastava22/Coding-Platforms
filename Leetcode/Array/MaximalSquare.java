class Solution {
    public int maximalSquare(char[][] matrix) {
       int rows = matrix.length;
        int cols = matrix[0].length;
        int maxLength = 0;
        
        int dp[][] = new int[rows+1][cols+1];
        
        for(int i = rows-1; i >=0; i--) {
            for(int j = cols-1; j >= 0; j--) {
                if(matrix[i][j] == '1')
                    dp[i][j] = Math.min(Math.min(dp[i+1][j],dp[i][j+1]), dp[i+1][j+1]) + 1;
                maxLength = Math.max(maxLength, dp[i][j]);
            }
        }
        
        return maxLength*maxLength;
    }
}
