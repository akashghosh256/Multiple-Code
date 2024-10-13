compare two strings lexicographically
Given 2 string having both uppercase and lowercase characters. 
Irrespective of the case determine the lexicographically smaller string return "-1" if 
first string is smaller return 1 if second string is smaller and 0 if both are equal java code


import java.util.Scanner;

public class Main {
    
    // Function to compare two strings lexicographically, ignoring case
    static int compareStrings(String str1, String str2) {
        // Convert both strings to lowercase to ignore case sensitivity
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        
        // Use the compareTo method to compare strings lexicographically
        int result = lowerStr1.compareTo(lowerStr2);
        
        // Return -1 if the first string is smaller, 1 if the second is smaller, and 0 if they are equal
        if (result < 0) {
            return -1;  // First string is smaller
        } else if (result > 0) {
            return 1;   // Second string is smaller
        } else {
            return 0;   // Both strings are equal
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Read two strings from user input
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        
        // Compare the strings and print the result
        System.out.println(compareStrings(str1, str2));
    }
}

orrrrrrrrrrrrrrrrrrrrrrrrrrrr


import java.util.Scanner;

public class Main {
    
    // Function to compare two strings lexicographically, ignoring case
    static int compareStrings(String str1, String str2) {
        // Convert both strings to lowercase to ignore case sensitivity
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        
        int i = 0;
        
        // Loop through the characters of both strings while they are equal
        while (i < lowerStr1.length() && i < lowerStr2.length()) {
            char ch1 = lowerStr1.charAt(i);
            char ch2 = lowerStr2.charAt(i);
            
            // If characters are not equal, return comparison result
            if (ch1 < ch2) {
                return -1;  // First string is smaller
            } else if (ch1 > ch2) {
                return 1;   // Second string is smaller
            }
            i++;  // Move to the next character
        }
        
        // After comparing common length, check if one string is longer
        if (lowerStr1.length() < lowerStr2.length()) {
            return -1;  // First string is smaller
        } else if (lowerStr1.length() > lowerStr2.length()) {
            return 1;   // Second string is smaller
        }
        
        // If we get here, the strings are equal
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Read two strings from user input
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        
        // Compare the strings and print the result
        System.out.println(compareStrings(str1, str2));
    }
}



