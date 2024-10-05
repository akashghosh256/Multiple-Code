public import java.util.Scanner;
import java.io.IOException;



public class Main {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        
        // Reading inputs
        int r = in.nextInt();   // Radius of the circle
        int x1 = in.nextInt();   // Starting point x1
        int y1 = in.nextInt();   // Starting point y1
        int x2 = in.nextInt();   // Destination point x2
        int y2 = in.nextInt();   // Destination point y2
        
        // Calculating the straight-line distance between points (x1, y1) and (x2, y2)
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        
        // Calculating the circumference of the circle
        double circumference = 2 * Math.PI * r;
        
        // Calculating the number of rotations (we need to move enough times around the circle)
        int rotations = (int) Math.ceil(distance / circumference);
        
        // Output the result
        System.out.println(rotations);
    }
}




