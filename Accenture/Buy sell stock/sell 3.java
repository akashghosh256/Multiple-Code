class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        
        int n = prices.length;
        int[] leftProfit = new int[n];
        int[] rightProfit = new int[n];
        
        // Left pass to track the max profit until each day
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftProfit[i] = Math.max(leftProfit[i - 1], prices[i] - minPrice);
        }
        
        // Right pass to track the max profit from each day onwards
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - prices[i]);
        }
        
        // Combine the two profits
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, leftProfit[i] + rightProfit[i]);
        }
        
        return maxProfit;
    }
}


Here's a logical breakdown of why the solution works for "Buy and Sell Stocks III," where you can perform at most two transactions:

### Problem Restatement:
You want to maximize your profit by buying and selling a stock on different days. However, you can complete at most **two transactions** (i.e., buy once and sell once, then buy again and sell again). You can't engage in multiple simultaneous transactions.

### Code Explanation:

1. **Two Transactions Breakdown**:
   The goal is to split the price array into two parts:
   - One part for the first transaction (buy and sell once).
   - Another part for the second transaction (buy and sell again).
   
   This way, you maximize the profit of **two transactions**. 
   
2. **Two Arrays (leftProfit and rightProfit)**:
   - `leftProfit[i]`: Maximum profit you can make from day 0 to day `i` (by doing one transaction in this period).
   - `rightProfit[i]`: Maximum profit you can make from day `i` to the last day (again, by doing one transaction in this period).

3. **Left Pass (Building `leftProfit`)**:
   - You loop from the start (`i = 0`) to the end (`i = n-1`).
   - **minPrice** keeps track of the lowest price seen so far.
   - For each day `i`, the profit if you sell the stock on that day would be `prices[i] - minPrice`. You update `leftProfit[i]` with the maximum of the previous day’s profit or today's profit.
   
   This ensures that `leftProfit[i]` stores the **maximum profit** that can be made from the **start** of the prices array up to day `i`.

4. **Right Pass (Building `rightProfit`)**:
   - You loop from the end (`i = n-1`) to the start (`i = 0`).
   - **maxPrice** keeps track of the highest price seen from the current day to the last day.
   - For each day `i`, the profit if you buy the stock on that day and sell it at `maxPrice` would be `maxPrice - prices[i]`. You update `rightProfit[i]` similarly, with the maximum of future profits or today's profit.
   
   This ensures that `rightProfit[i]` stores the **maximum profit** that can be made from day `i` to the **end** of the prices array.

5. **Combining the Two Passes**:
   - Finally, you calculate the maximum possible profit by combining the two transactions.
   - For each day `i`, the total profit would be the sum of:
     - The maximum profit from day 0 to day `i` (stored in `leftProfit[i]`).
     - The maximum profit from day `i` to the end (stored in `rightProfit[i]`).
   
   This way, you consider **all possible days** where you could complete one transaction, then start another, and track the best possible combined profit.

6. **Return the Maximum Profit**:
   The solution loops through all days and finds the maximum of `leftProfit[i] + rightProfit[i]`, which gives the maximum total profit from at most two transactions.

### Why This Logic Works:
- By breaking the problem into two parts (left and right transactions), we simplify the problem of finding the optimal points for two transactions.
- The two passes (from left to right and from right to left) allow us to capture the best profit in both parts of the array, ensuring that no matter where the transactions happen, we calculate the optimal combination of profits.
- The final combination of `leftProfit` and `rightProfit` ensures that you're accounting for the best possible split between the first and second transactions.

Thus, this approach efficiently solves the problem by reducing it to two simpler single-transaction problems, which we can handle optimally.