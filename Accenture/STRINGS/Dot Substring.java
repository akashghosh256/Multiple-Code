find  the longest string / substring with no dot (.)

import java.util.*;
import java.io.*;


public class Main{
    public static void main (String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        
        int maxL=0;
        int len = 0;
        
        for (char i : st.toCharArray()){
            if(i != '.') len ++;
            else{
                maxL = Math.max(maxL, len);
                len  =0;
            }
        }
        System.out.println(len);
        
    }
}













