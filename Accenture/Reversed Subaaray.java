import java.util.Arrays;

public class Main {

    // Return true if reversing the subarray will sort the array, else return false.
    public static boolean checkReverse(int[] arr, int n) {
        // Copying the array.
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // Sort the copied array.
        Arrays.sort(temp);

        // Finding the first mismatch.
        int front;
        for (front = 0; front < n; front++) {
            if (temp[front] != arr[front]) {
                break;
            }
        }

        // Finding the last mismatch.
        int back;
        for (back = n - 1; back >= 0; back--) {
            if (temp[back] != arr[back]) {
                break;
            }
        }

        // If the whole array is sorted
        if (front >= back) {
            System.out.println("All sort front = n , back = 0");
            return true;
        }

        // Checking if the subarray is decreasing or not.
        do {
            front++;
            if (arr[front - 1] < arr[front]) {
                System.out.println("here false 4,5,3");
                return false;
            }
        } while (front != back);
        System.out.println("here true 5,4,3");
        return true;
    }

    // Driver Program
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5,4,3};
        int n = arr.length;

        if (checkReverse(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
