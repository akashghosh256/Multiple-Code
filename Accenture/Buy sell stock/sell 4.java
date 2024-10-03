// go for striver 3 same video intuition

class Solution {

    int solve(int ind, int prices[], int n, int cap, int buy, int dp[][][]){

        if( cap == 0) return 0;
        if(ind == n) return 0;

        if(dp[ind][buy][cap] != -1) return dp[ind][buy][cap]; 

        int profit = 0;

        if(buy == 1){
            int take = -prices[ind] + solve(ind+1,prices,n,cap,0,dp);
            int notTake = 0 + solve(ind+1,prices,n,cap,1,dp);
            dp[ind][buy][cap] = Math.max(take, notTake);
        }
        else{
            int sell = prices[ind] + solve(ind+1,prices,n,cap-1,1,dp);
            int notSell = 0 + solve(ind+1,prices,n,cap,0,dp);
            dp[ind][buy][cap] = Math.max(sell,notSell);
        }

        return dp[ind][buy][cap];




    }


    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int cap = k; // at most k transactions
        int dp[][][] = new int [n+1][2][cap+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<2;j++){
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(0,prices,n,cap,1,dp);
        
    }
}
