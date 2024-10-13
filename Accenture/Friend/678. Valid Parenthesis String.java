
class Solution(object):
    n = 0

    def solve(self, i, s, open, dp):
        global n
        if i >= n:
            return open == 0
        
        if dp[i][open] != -1:
            return dp[i][open] == 1
        
        isValid = False

        if s[i] == '(':
            isValid |= self.solve(i + 1, s, open + 1, dp)
        elif s[i] == '*':
            isValid |= self.solve(i + 1, s, open + 1, dp)
            isValid |= self.solve(i + 1, s, open, dp)
            if open > 0:
                isValid |= self.solve(i + 1, s, open - 1, dp)
        else:
            if open > 0:
                isValid |= self.solve(i + 1, s, open - 1, dp)

        if isValid:
            dp[i][open] = 1
        else:
            dp[i][open] = 0
        return isValid

    def checkValidString(self, s):
        """
        :type s: str
        :rtype: bool
        """
        global n
        n = len(s)
        maxOpen = n  # The maximum number of open parentheses
        dp = [[-1] * (n + 1) for _ in range(n)]  # Initialize the dp table with -1
        return self.solve(0, s, 0, dp)



class Solution {
    int n;
    private boolean solve(int i, char ar[], int open, int dp[][]){
        if(i>=n) return open == 0;
        if(dp[i][open] != -1) return dp[i][open] == 1;

        boolean isValid = false;

        if(ar[i] == '('){
            isValid |= solve(i+1,ar,open+1,dp);
        }
        else if( ar[i] == '*'){
            isValid |= solve(i+1,ar,open+1,dp);
            isValid |= solve(i+1,ar,open,dp); // think empty
            if(open>0)
            isValid |= solve(i+1,ar,open-1,dp);
        }
        else {
            
            if(open > 0)
             isValid |= solve(i+1,ar,open-1,dp);
        }
        if(isValid) dp[i][open] = 1;
        else dp[i][open] = 0;
        return isValid;

    }



    public boolean checkValidString(String s) {
        char ar[] = s.toCharArray();
        n = ar.length;

        // dp size n * n bracket can be (((((.. == n and index == n 
        int dp[][] = new int[n][n];
        for(int row[] : dp)
        Arrays.fill(row, -1);

        return solve(0,ar,0,dp);




    }
}
