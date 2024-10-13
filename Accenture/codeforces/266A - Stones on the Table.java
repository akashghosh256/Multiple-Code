
 
 
 
266A - Stones on the Table 

import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
         
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int count = 0;
        for(int i=0; i<n-1; i++){
         if(str.charAt(i) == str.charAt(i+1))
         count++;
        }
        
        System.out.println(count);
        
    }
}

