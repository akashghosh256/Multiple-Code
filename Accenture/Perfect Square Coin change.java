Given an integer n, return the least number of perfect square numbers that sum to n.
A perfect square is an integer that is the square of an integer; in other words, it is 
the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not,


Here coins are just replaced by perfect square numbers and Target is still Same 





https://leetcode.com/problems/perfect-squares/

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int result = findMinSquares(n, dp);
        return result;
    }

    // Recursive function with memoization (pick/not-pick approach)
    public int findMinSquares(int n, int[] dp) {
        if (n == 0) return 0; // Base case: if n is 0, no squares are needed

        if (dp[n] != -1) return dp[n]; // Return cached result if available

        int minSquares = Integer.MAX_VALUE;

        // Try all perfect squares <= n
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            int subResult = findMinSquares(n - square, dp);
            if (subResult != Integer.MAX_VALUE) {
                minSquares = Math.min(minSquares, subResult + 1); // Pick the square
            }
        }

        // Store the result in dp array
        dp[n] = minSquares;
        return minSquares;
    }
}





https://leetcode.com/problems/coin-change/

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int result = findMinCoins(coins, amount, dp);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    // Recursive function with memoization (pick/not-pick approach)
    public int findMinCoins(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0; // Base case: no amount left to change

        if (dp[amount] != -1) return dp[amount]; // Return cached result if available

        int minCoins = Integer.MAX_VALUE;
        
        // Try picking each coin
        for (int coin : coins) {
            if (amount - coin >= 0) {
                int subResult = findMinCoins(coins, amount - coin, dp);
                if (subResult != Integer.MAX_VALUE) {
                    minCoins = Math.min(minCoins, subResult + 1); // Pick the coin
                }
            }
        }

        // Store the result in dp array
        dp[amount] = minCoins;
        return minCoins;
    }
}
















