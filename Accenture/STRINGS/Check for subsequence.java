https://www.geeksforgeeks.org/problems/binary-string-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
https://www.geeksforgeeks.org/problems/implement-strstr/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
https://www.geeksforgeeks.org/problems/sort-the-string-in-descending-order3542/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
https://leetcode.com/problems/longest-common-subsequence/description/
https://leetcode.com/problems/longest-common-subsequence/description/

if(ch[a-'0'] == 1) return Character.toString(a);
class Solution {


    boolean solve(String A, String B, int m, int n){
      
      if(m == 0) return true;
      if(n == 0) return false;
      
      if(A.charAt(m-1) == B.charAt(n-1))
       return solve(A, B, m-1, n-1);
       
      return solve(A, B, m, n-1);
      
  }
  public boolean isSubsequence(String s, String t) {
      return solve(s,t,s.length(), t.length());
  }
}


















import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    static String ans = "";
    static int n=0;
    static int m=0;
    
    static int f(int i,int j, String a, String b, String t){
        if(i>=n || j>=m) return 0;
        
        if(t.length() > ans.length())
        ans = t;
        
        
        if(a.charAt(i) == b.charAt(j)){
            t = t + a.charAt(i);
            
            if(t.length() > ans.length())
            ans = t;
            
            return 1 + f(i+1,j+1,a,b,t);
        }
        
         return  0 + Math.max(f(i+1,j,a,b,t),f(i,j+1,a,b,t));
        
        
    }
    
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		 n = a.length();
		 m = b.length();
		
// 		int dp[][] = new int[n+1][m+1];
// 		for(int i[] : dp){
// 		    Arrays.fill(dp,-1);
// 		}
		
		int p = f(0,0,a,b,"");
		System.out.println(ans);
		
	//	return ans;
		
		
		

	}
}

https://www.youtube.com/watch?v=0W8dVZUL1MQ    45:00
Q. in a remote village, there existed two musical strings s1 and s2 
in these strings was hidden a secret encoded in their characters. 
your task is to find and return an integer value representing the encoded 
secret of the strings by finding the sum of the ascii values of the characters 
in the longest common substring between these two strings. return 0 if there 
is no common substring. note: • strings s1 and s2 contain english 
alphabets in lower case only. 
if there are multiple longest common substrings, 
then return the ascii sum of the substring that occurs first





import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    static String ans = "";
    static int n=0;
    static int m=0;
    
    static int f(int i,int j, String a, String b, String t){
        if(i>=n || j>=m) return 0;
        
        if(t.length() > ans.length())
        ans = t;
        
        
        if(a.charAt(i) == b.charAt(j)){
            t = t + a.charAt(i);
            
            if(t.length() > ans.length())
            ans = t;
            
            return 1 + f(i+1,j+1,a,b,t);
        }
        t="";    
         return  0 + Math.max(f(i+1,j,a,b,t),f(i,j+1,a,b,t));
        
        
    }
    
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		 n = a.length();
		 m = b.length();
		
// 		int dp[][] = new int[n+1][m+1];
// 		for(int i[] : dp){
// 		    Arrays.fill(dp,-1);
// 		}
		
		int p = f(0,0,a,b,"");
		System.out.println("longest substring "+ ans + " length "+ p);
		
		int sum = 0;
		
		for(char i : ans.toCharArray()){
		    sum += (int)i;
		}
		
		System.out.println(sum);
		
		
		
		
	//	return ans;
		
		
		

	}
}
