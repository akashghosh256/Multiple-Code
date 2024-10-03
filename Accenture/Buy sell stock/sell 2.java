https://www.youtube.com/watch?v=3SJ3pUkPQMc
class Solution {

    int n;
       
    
    
        public int maxProfit(int[] prices) {
            
            n = prices.length;
            int profit = 0;
            for(int i=1; i<n; i++){
                if(prices[i] > prices[i-1])
                profit += prices[i] - prices[i-1];
            }
    
            return profit;
            
        }
    }
    
    
    
    
    