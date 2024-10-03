https://codeforces.com/problemset/problem/339/B



import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        // Input n (number of houses) and m (number of tasks)
        int n = in.nextInt();
        int m = in.nextInt();
        
        // Array to store tasks at each house
        int[] tasks = new int[m];
        
        for (int i = 0; i < m; i++) {
            tasks[i] = in.nextInt();
        }
        
        long res = 0; // This will store the total time (make it long to avoid overflow)
        int prev = 1; // Xenia starts at house 1
        
        for (int i = 0; i < m; i++) {
            int currentTask = tasks[i];
            
            if (currentTask >= prev) {
                // Move directly from prev to currentTask
                res += currentTask - prev;
            } else {
                // If the task is behind, wrap around the ringroad
                res += (n - prev) + currentTask;
            }
            
            prev = currentTask; // Update current position
        }
        
        System.out.println(res);
    }
}




or============================================

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        // Input n (number of houses) and m (number of tasks)
        int n = in.nextInt();  // Total number of houses
        int m = in.nextInt();  // Total number of tasks
        
        // Array to store tasks at each house
        int[] tasks = new int[m];
        
        for (int i = 0; i < m; i++) {
            tasks[i] = in.nextInt();
        }
        
        long res = 0; // This will store the total time (make it long to avoid overflow)
        int prev = 1; // Xenia starts at house 1
        
        for (int i = 0; i < m; i++) {
            int currentTask = tasks[i];
            
            // Using modulus to calculate circular distance
            res += (currentTask - prev + n) % n;
            
            prev = currentTask; // Update current position to the current task
        }
        
        System.out.println(res);
    }
}



























