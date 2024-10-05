https://www.geeksforgeeks.org/divide-a-number-into-two-unequal-even-parts/


// Java code to implement above approach
import java.util.*;
public class GFG {

// Function to check if N can be divided 
// into two unequal even parts
static boolean evenParts(int N)
{ 

	// Check if N is equal to 2 or 4 
	if(N == 2 || N == 4)
	return false;

	// Check if N is even
	if(N % 2 == 0)
	return true;
	else
	return false;
}

// Driver code
public static void main(String args[])
{
	int N = 8;

	// Function call
	boolean ans = evenParts(N);

	if(ans)
	System.out.println("YES");
	else
	System.out.println("NO");

}
}

// This code is contributed by Samim Hossain Mondal.











