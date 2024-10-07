Count occurrences of a word in string

import java.util.*;
import java.io.*;


public class Main{
    public static void main (String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String find = in.next();
        
    String ar[] = str.split(" ");
    
    for(String i : ar){
     System.out.println(i);
    }
     
     int count = 0;
     for(String i : ar){
         if(i.equals(find)) count++;
     }
     
     
        
        
        System.out.println("Answer : "+count);
        
    }
}













