
https://codeforces.com/problemset/problem/1950/C

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();  // Consume newline left by nextInt()
        
        for (int i = 0; i < t; i++) {
            String time24 = scanner.nextLine();
            String[] timeParts = time24.split(":");
            int hour24 = Integer.parseInt(timeParts[0]);
            String minutes = timeParts[1];
            
            // Determine AM/PM
            String period = (hour24 >= 12) ? "PM" : "AM";
            
            // Convert hour from 24-hour to 12-hour format
            int hour12 = hour24 % 12;
            if (hour12 == 0) {
                hour12 = 12;
            }
            
            // Print result in 12-hour format
            System.out.printf("%02d:%s %s\n", hour12, minutes, period);
        }
        
        scanner.close();
    }
}
