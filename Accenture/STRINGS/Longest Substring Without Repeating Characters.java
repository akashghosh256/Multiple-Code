Longest Substring Without Repeating Characters 
https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int len = 0;
        Map<Character,Integer> map = new HashMap<>();

        while(right<n){
            char ch = s.charAt(right);
            if(map.containsKey(ch))
            left = Math.max(left, map.get(ch)+1);

            len = Math.max(len, right-left+1);
            // we need to update the character new index very important 
            map.put(ch,right);
            right++;

        }
        return len;
        
    }
}

