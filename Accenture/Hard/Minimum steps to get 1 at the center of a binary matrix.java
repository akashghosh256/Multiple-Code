Minimum steps to get 1 at the center of a binary matrix

https://www.geeksforgeeks.org/minimum-steps-to-get-1-at-the-center-of-a-binary-matrix/
https://www.youtube.com/watch?v=00rULdae_4g

// Java implementation of the approach
class GFG
{

static int N = 5;

// Function to return the
// minimum moves required
static int minMoves(int mat[][])
{

	// Center of the matrix
	int cI = N / 2, cJ = N / 2;

	// Find the position of the 1
	int oneI = 0, oneJ = 0;
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++) 
		{
			if (mat[i][j] == 1) 
			{
				oneI = i;
				oneJ = j;
				break;
			}
		}
	}

	return (Math.abs(cI - oneI) + Math.abs(cJ - oneJ));
}

// Driver code
public static void main(String[] args)
{
	int mat[][] = { { 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0 },
					{ 0, 0, 1, 0, 0 } };

	System.out.print(minMoves(mat));
}
}

// This code is contributed by PrinciRaj1992

    

