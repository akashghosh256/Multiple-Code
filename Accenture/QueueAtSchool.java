https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline after integer input
        
        String s = sc.nextLine();
        char[] arr = s.toCharArray(); // Convert string to char array
        
        while (t-- > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    // Swap adjacent 'B' and 'G'
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++; // Skip the next element
                }
            }
        }
        
        System.out.println(new String(arr)); // Convert char array back to string and print
        sc.close();
    }
}
