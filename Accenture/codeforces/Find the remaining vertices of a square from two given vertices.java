 Find the remaining vertices of a square from two given vertices 
 https://www.youtube.com/watch?v=ayxUdJpuZfE
 https://www.geeksforgeeks.org/find-the-remaining-vertices-of-a-square-from-two-given-vertices/

 // Java program for the above approach
import java.util.*;

class GFG{

// Function to find the remaining
// vertices of a square
static void findVertices(int x1, int y1,
                         int x2, int y2)
{
    
    // Check if the x-coordinates
    // are equal
    if (x1 == x2) 
    {
        System.out.print((x1 + y2 - y1) + 
                        ", " + y1 + "\n");

        System.out.print((x2 + y2 - y1) + 
                        ", " + y2);
    }

    // Check if the y-coordinates
    // are equal
    else if (y1 == y2)
    {
        System.out.print(x1 + ", " + 
                        (y1 + x2 - x1) + "\n");

        System.out.print(x2 + ", " + 
                        (y2 + x2 - x1));
    }

    // If the given coordinates
    // forms a diagonal of the square
    else if (Math.abs(x2 - x1) == 
             Math.abs(y2 - y1))
    {
        System.out.print(x1 + ", " + y2 + "\n");
        System.out.print(x2 + ", " + y1);
    }

    // Otherwise
    else

        // Square does not exist
        System.out.print("-1");
}

// Driver Code
public static void main(String[] args)
{
    
    // Given two vertices
    int x1 = 1, y1 = 2;
    int x2 = 3, y2 = 4;
    
    findVertices(x1, y1, x2, y2);
}
}

// This code is contributed by Amit Katiyar

    
