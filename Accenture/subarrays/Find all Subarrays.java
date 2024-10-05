public class Main {


    // no gpt short cut
    
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        // Iterate over all possible starting points
        for (int i = 0; i < n; i++) {
            // Iterate over all possible ending points
            for (int j = i; j < n; j++) {
                // Print the subarray from index i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();  // Move to the next line after printing a subarray
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        
        System.out.println("All subarrays:");
        printAllSubarrays(arr);
    }
}
