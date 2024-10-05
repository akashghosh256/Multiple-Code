Longest Substring having equal count of Vowels and Consonants

import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String st = in.next();
        int n = st.length();
// code similar to subarrays sum equal to k
        // vowel = 1, consonant = -1
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            char a = st.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                ar[i] = 1;
            } else {
                ar[i] = -1;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int cumSum = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {
            cumSum += ar[i];

            if (cumSum == 0) {
                // This handles the case where the cumulative sum is 0 (i.e., the longest valid substring starts from the beginning).
                ans = Math.max(ans, i + 1);
                start = 0;
                end = i;
            }

            if (map.containsKey(cumSum)) {
                int length = i - map.get(cumSum);
                if (length > ans) {
                    ans = length;
                    start = map.get(cumSum) + 1;  // The next index after the stored cumulative sum index
                    end = i;
                }
            }

            // Only put the current cumulative sum if it is not already present
            if (!map.containsKey(cumSum)) {
                map.put(cumSum, i);
            }
        }

        // Only print the result if a valid substring was found
        if (start != -1 && end != -1) {
            String res = st.substring(start, end + 1);
            System.out.println(res);
        } else {
            System.out.println("No valid substring found.");
        }

        System.out.println("Length of the longest substring: " + ans);
    }
}
