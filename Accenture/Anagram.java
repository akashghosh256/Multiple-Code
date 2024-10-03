class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String s, String t) {

        // Your code here
        if(s.length() != t.length()) return false;
        int ar[] = new int[26];
        Arrays.fill(ar,0);

        for(int i =0; i<s.length(); i++){
            ar[s.charAt(i)-'a']++;
        }
        for(char i : t.toCharArray()){
            if(ar[i-'a']>0) ar[i-'a']--;
            else return false;
        }

        return true;
    }
}