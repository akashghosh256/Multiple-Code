https://leetcode.com/problems/largest-odd-number-in-string/description/

class Solution {
     
    public String largestOddNumber(String num) {
        int n = num.length();
        String ans="";

        for(int i=n-1; i>=0; i--){
            if((num.charAt(i)-'0')%2 != 0){
                System.out.println("yes");
                ans = num.substring(0,i+1);
                break;
            }
        }

        return ans;
        
    }
}