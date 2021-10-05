class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        return climbStairsUtil(dp, n);
    }
    
    public int climbStairsUtil(int dp[], int n){
        //If n is less than 0 then simply return 0
        if(n<0) return 0;
        
        //if n is zero then simply return 1
        if(n==0) return 1;
        
        //Memoization
        if(dp[n]!=-1) return dp[n];
        
        //Either we can climb one stair or two stair at a time.
        dp[n]=climbStairsUtil(dp, n-1) + climbStairsUtil(dp, n-2);

        //return the output in the end
        return dp[n];
    }
}
