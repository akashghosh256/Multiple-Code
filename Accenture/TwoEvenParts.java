Given a number N, the task is to check if this number can be 
divided into 2 even parts.

Examples:

Input: N = 8
Output: YES
Explanation: 8 can be divided into two even parts in two ways,
 2, 6 or 4, 4 as both are even.


Input: N = 5
Output: NO

import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        
        // only even number can be divded in two even parts 
        // eg 26 = 20+6 or 10+16 (not 13 + 13 is important)
        
        if(n<=1) System.out.println("No");
        
        if((n&1) != 1) System.out.println("yes");
        else System.out.println("No");
        
        
    }
}


