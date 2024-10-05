Count Subarrays first and last element sum of subarray is less than x
Sample Input
4 4
1 3 5 7
Your Output
3

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // Size of array
        int x = in.nextInt();   // The maximum sum of min and max elements allowed
        int ar[] = new int[n];  // Array of integers
        
        for(int i = 0; i < n; i++)
            ar[i] = in.nextInt();  // Reading the array
        
        int i = 0, j = 0;  // Two pointers: i and j
        int count = 0;     // To keep track of the valid subarrays
        
        while (j < n && i<=j) {
            // Check if the sum of min (ar[i]) and max (ar[j]) is less than or equal to x
            if (ar[i] + ar[j] <= x) {
                // All subarrays from i to j are valid, so add (j - i + 1) to the count
                count += (j - i + 1);
                j++;  // Move the right pointer forward to include more elements
            } else {
                i++;  // Move the left pointer to try smaller subarrays
            }
        }
        
        System.out.println(count);  // Output the count of valid subarrays
    }
}

