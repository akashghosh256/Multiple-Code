import java.util.*;
import java.io.*;
// https://prepinsta.com/tcs-codevita/java-code-for-good-string-tcs-codevita-prepinsta/
class Main{
    public static void main(String args[]) throws IOException{
       Scanner in = new Scanner(System.in);
       String s = in.nextLine();
       String t = in.nextLine();
       
       int n = s.length();
       int a[] = new int[n];
       
       for(int i=0; i<n; i++){
           a[i] = (int)s.charAt(i);
       }
       Arrays.sort(a);
       
       int res = 0;
       int prev = (int)s.charAt(0);
       
       for(int i=0; i<t.length();i++){
           int val = (int)t.charAt(i);
           int l = 0, r= n-1;
           int good = Integer.MAX_VALUE;
           int cur = -1;
           
           // Binary search
           while(l<=r){
               int mid = (l+r)/2;
               
               if(a[mid] == val){
                   cur = prev;
                   good = 0;
                   break;
               }
               else if (a[mid] < val){
                   if(Math.abs(a[mid] - val) < good){
                       good = Math.abs(a[mid] - val);
                       cur = a[mid];
                   }
                   else if(Math.abs(a[mid] - val) == good){
                       if(Math.abs(a[mid] - prev) < Math.abs(cur - prev)){
                           good = Math.abs(a[mid] - prev);
                           cur = a[mid];
                       }
                       else{
                           good = Math.abs(cur - prev);
                       }
                   }
                   l = mid + 1;
               }
               else{
                   if(Math.abs(a[mid] - val) < good){
                       good = Math.abs(a[mid] - val);
                       cur = a[mid];
                   }
                   else if(Math.abs(a[mid] - val) == good){
                       if(Math.abs(a[mid] - prev) < Math.abs(cur - prev)){
                           good = Math.abs(a[mid] - prev);
                           cur = a[mid];
                       }
                       else{
                           good = Math.abs(cur - prev);
                       }
                   }
                   r = mid - 1;
               }
           }
           
           // Update res and prev **after** binary search completes
           res += good;
           prev = cur;
       }
       
       System.out.println(res);
    }
}
