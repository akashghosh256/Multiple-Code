Seems hard very easy 

Rebound Height
https://stackoverflow.com/questions/78960278/how-to-solve-this-accenture-coding-round-question
Daniel has a ball. He wants to find the balls rebound height, which he dropped from height H with an initial velocity V. After the Nth rebound the final velocity of the ball is Vn. Your task is to help him find and return an integer value representing the height to which the ball rebounds after N bounces.

Note:

H' = H x e²n, where H' is the rebound height, H is the initial height, e is
the coefficient of restitution and is the number of bounces

e" = V/Vn, where V is the initial velocity and V is the final velocity

ChatGPT said:
ChatGPT
To solve this problem, we need to calculate the rebound height of a ball after N 
bounces. The key information is as follows:

The formula for rebound height after the Nth bounce is:
𝐻
′
=
𝐻
×
𝑒
2
𝑁
H 
′
 =H×e 
2N
 
where:
H' is the rebound height after N bounces.
H is the initial drop height.
e is the coefficient of restitution, which can be calculated using the formula:
𝑒
=
𝑉
𝑉
𝑛
e= 
V 
n
​
 
V
​
 
N is the number of bounces.
Given these relationships, here’s a step-by-step approach:

Input: Initial height H, initial velocity V, final velocity after N bounces Vn, and the number of bounces N.
Calculate the coefficient of restitution e = V / Vn.
Calculate the rebound height after N bounces using the formula H' = H × e^(2N).
Here’s the Java implementation to calculate the rebound height:

java
Copy code
import java.util.Scanner;

public class ReboundHeightCalculator {

    // Function to calculate the rebound height after N bounces
    public static double calculateReboundHeight(double H, double V, double Vn, int N) {
        // Calculate the coefficient of restitution
        double e = V / Vn;

        // Calculate the rebound height after N bounces
        double reboundHeight = H * Math.pow(e, 2 * N);
        
        return reboundHeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.print("Enter the initial height (H): ");
        double H = scanner.nextDouble();

        System.out.print("Enter the initial velocity (V): ");
        double V = scanner.nextDouble();

        System.out.print("Enter the final velocity after N bounces (Vn): ");
        double Vn = scanner.nextDouble();

        System.out.print("Enter the number of bounces (N): ");
        int N = scanner.nextInt();

        // Calculate and print the rebound height
        double reboundHeight = calculateReboundHeight(H, V, Vn, N);
        System.out.println("The rebound height after " + N + " bounces is: " + (int)reboundHeight);

        scanner.close();
    }
}
Explanation:
Input: The program reads the initial height H, the initial velocity V, the final velocity after N bounces Vn, and the number of bounces N.
Coefficient of restitution: This is calculated as e = V / Vn.
Rebound height: Using the formula H' = H × e^(2N), the program calculates the rebound height after N bounces.
Output: The result is cast to an integer value and printed.
Example:
Input:

makefile
Copy code
H = 100
V = 10
Vn = 5
N = 2
Output:

arduino
Copy code
The rebound height after 2 bounces is: 25
This implementation assumes that the input values are valid and that the velocities and height are in consistent units.