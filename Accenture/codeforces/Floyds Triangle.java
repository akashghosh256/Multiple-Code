Floyds Triangle
Sample Input
4
Your Output
1 
2 3 
4 5 6 
7 8 9 10 


import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
         
        int n = in.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print(count+" "); 
               count++;
            }
            System.out.println();
        }
        
        // System.out.println(count);
        
    }
}


n = int(input())  # Read the input integer

count = 1
for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(count, end=" ")
        count += 1
    print()  # Move to the next line after each row








