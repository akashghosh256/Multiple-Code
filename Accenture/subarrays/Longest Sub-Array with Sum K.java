https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card



class Solution {
    // Function for finding the length of the longest subarray with sum K
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Variable to store the length of the longest subarray
        int len = 0;
        int cumSum = 0;

        // HashMap to store (prefix sum, index)
        Map<Integer, Integer> map = new HashMap<>();
        
        // Store 0 cumulative sum at index -1 to handle subarrays starting from index 0
        map.put(0, -1);
        
        for (int i = 0; i < N; i++) {
            // Calculate cumulative sum
            cumSum += A[i];
            
            // Check if (cumSum - K) exists in the map, meaning we found a subarray with sum K
            int rem = cumSum - K;
            if (map.containsKey(rem)) {
                // Update the length of the longest subarray found so far
                len = Math.max(len, i - map.get(rem));
            }

            // Only insert the current cumulative sum into the map if it's not already present
            // This ensures we use the earliest occurrence of the sum to maximize the subarray length
            if (!map.containsKey(cumSum)) {
                map.put(cumSum, i);
            }
        }

        return len;
    }
}















