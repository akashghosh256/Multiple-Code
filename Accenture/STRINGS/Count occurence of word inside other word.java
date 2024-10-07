 Count occurence of word inside other word 


 import java.util.*;
import java.io.*;

public class Main{
    public static void main (String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();  // Input the main string
        String find = in.next();     // Input the word to find

        int n = str.length();
        int m = find.length();
        int count = 0;
        
        for (int i = 0; i <= n - m; i++) {  // Ensure i+m does not go out of bounds
            if (str.charAt(i) == find.charAt(0)) {  // Check first character match
                if (str.substring(i, i + m).equals(find)) {
                    count++;
                }
            }
        }

        System.out.println("Answer : " + count);
    }
}

Sample Input
hellohellohelloh
hello
Your Output
Answer : 3
