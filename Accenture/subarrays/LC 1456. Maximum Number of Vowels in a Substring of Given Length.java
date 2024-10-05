1456. Maximum Number of Vowels in a Substring of Given Length


import java.util.HashMap;

class Solution {
     boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    public int maxVowels(String s, int k) {
        // Function to check if a character is a vowel
       

        int maxVowels = 0;
        int currentVowels = 0;
        
        // Use a HashMap to track the counts of vowels within a sliding window of size k
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize the sliding window with the first `k` characters
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // Now slide the window from index k onwards
        for (int i = k; i < s.length(); i++) {
            // Remove the character that goes out of the window
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            // Add the new character that comes into the window
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }

            // Update the maximum number of vowels found
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }
}
