343. Integer Break 
Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.

Return the maximum product you can get.
https://leetcode.com/problems/integer-break/description/
https://www.youtube.com/watch?v=iXtqfIrWMZg


class Solution {
    private int solve(int a, int dp[]){
        if(a<=1) return 0;
        if(dp[a] != -1) return dp[a];

        int maxVal = 0;

        for(int i=1;i<a;i++){
        int val = i * Math.max(a-i, solve(a-i,dp));
        maxVal = Math.max(maxVal,val);
       } 
    return dp[a] = maxVal;

    }

    public int integerBreak(int n) {

       int ans = 0;
       int dp[] = new int[n];
       Arrays.fill(dp,-1);
       for(int i=1;i<n;i++){
        int val = i * Math.max(n-i, solve(n-i,dp));
        ans = Math.max(ans,val);
       } 

       return ans;
    }
}
