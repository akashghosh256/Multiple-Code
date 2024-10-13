 
import java.util.*;
import java.io.*;

public class Main {
    
   
    static char solve(String s) {
    int ar[] = new int[256];
    Arrays.fill(ar,0);
    int n = s.length();
    for(int i=0; i<n; i++){
        ar[s.charAt(i) -'a']++;
        if(ar[s.charAt(i) -'a'] == 2) return s.charAt(i);
    }
    return 'a';
    }
    
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
         
        String s = in.nextLine();  
        System.out.println(solve(s));
    }
}

Sample Input
abcdsdsesfffff
Your Output
d
