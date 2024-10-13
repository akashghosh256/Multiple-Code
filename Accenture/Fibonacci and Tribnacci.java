 Fibonacci and Tribnacci

 The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 // find nth
import java.util.*;
import java.io.*;

public class Main{
    
    static int fibo(int n){
        if( n<=1) return n;
        
        int prev1=0, prev2 = 1;
        int fib = 0;
        for(int i=2; i<=n; i++){
            fib = prev1 + prev2;
            prev2 = prev1;
            prev1 = fib;
        }
        
        return fib;
    }
    
    
    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
         
        int n = in.nextInt();

        System.out.println(fibo(n));
        
    }
}

a(n) = a(n-1) + a(n-2) + a(n-3) 
with 
a(0) = a(1) = 0, a(2) = 1.  

0, 0, 1, 1, 2, 4, 7, 13, 24, 44 ............

# cook your dish here
def solve(n):
    if n==1 or n == 2: 
        return 0
    if n == 3:
        return 1
    prev1 = prev2 = 0
    prev3 = 1
    tibo = 0
    for i in range(4,n+1,1):
        tibo = prev1 + prev2 + prev3
        prev1 = prev2
        prev2 = prev3
        prev3 = tibo
    return tibo
        
        
        



n = int(input())
print(solve(n))