
https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int ch[] = new int[26];
        Arrays.fill(ch,0);
        
        for(char i : line.toCharArray()){
            ch[i-'a']++;
        }
        
        int res = 0;
        char t='a';
        for(int i=0; i<26; i++)
        if( ch[i]> res) {
            res = ch[i];
            t = (char)(i+'a');
            
        }
        
        return t;
        
    }
    
}

or =====================================================

import java.util.Arrays;

class Solution {
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line) {
        // Array to store count of characters
        int ch[] = new int[26];  // 26 characters for a-z
        
        // Filling array with frequency of each character
        for(char i : line.toCharArray()) {
            if (i >= 'a' && i <= 'z') {  // Ensure it's a lowercase letter
                ch[i - 'a']++;
            }
        }
        
        int maxFrequency = 0; // To store the highest frequency
        char resultChar = 'a'; // Initialize with 'a'
        
        // Finding the character with maximum frequency
        for (int i = 0; i < 26; i++) {
            if (ch[i] > maxFrequency) {
                maxFrequency = ch[i];
                resultChar = (char)(i + 'a');  // Convert index to corresponding character
            }
        }
        
        return resultChar;  // Return the character with the highest frequency
    }
}


