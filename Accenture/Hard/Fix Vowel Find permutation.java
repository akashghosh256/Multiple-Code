You are a given a string S and your task is to find and return the count of permutation
formed by fixing the positions of the vowels present in the string 
Note :
Ensure result is non-negative
If there is no consonants then return 0

https://www.doubtnut.com/qna/209194909


eg: MULTIPLE
FIXED : _ U _ _ I _ _ E
Duplicate : L -> 2 
ways = 5!/ 2! == ans


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    static boolean vowel(char a){
       return "AEIOUaeiou".indexOf(a) != -1; 
    }
    
    
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n; i++)
        f*=i;
        
        return f;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		String st = in.nextLine();
		st = st.toLowerCase();
		int cc = 0;
		int ar[] = new int[256];
		Arrays.fill(ar,0);
		
		for(char i : st.toCharArray()){
		   if(!vowel(i)){
		       ar[i-'a']++;
		       cc++;  //consonat count 
		   }
		}
		
		int duplicate = 1;
		for (int i : ar){
		    if(i>1)
		    duplicate *= fact(i); 
		}
		int pos = fact(cc);
		int ans = pos/duplicate;
		System.out.println(ans);	
		
		

	}
}







