import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		double ht = in.nextDouble();
		
		double ans = (double) m / (Math.pow(ht,2));
		System.out.printf("Ans %.2f", ans);
	}
}
