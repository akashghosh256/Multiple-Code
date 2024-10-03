

class Solution {

    int solve(int ind, int prices[], int n, int buy, int dp[][]){

        if(ind >=n ) return 0;
        int profit = 0;

        if(dp[ind][buy] != -1) return dp[ind][buy];

        if(buy == 1){
            int take = -prices[ind] + solve(ind+1, prices, n,0, dp);
            int notTake = 0 + solve(ind+1, prices, n, 1, dp);
            // profit = Math.max(take, notTake);
            dp[ind][buy]= Math.max(take, notTake);

        }
        else{
        int sell =  prices[ind] + solve(ind+2,prices,n,1,dp);
        int notSell = 0 + solve(ind+1, prices, n, 0,dp);   
        dp[ind][buy] = Math.max(sell, notSell);
        }

        return dp[ind][buy];

    }


    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+1][2];
        for(int row[] : dp)
        Arrays.fill(row,-1);


        return solve(0,prices,n,1,dp);
        
    }
}
