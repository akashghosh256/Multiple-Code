https://www.programiz.com/c-programming/examples/quadratic-roots




import java.util.Scanner;

 class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c, discriminant, root1, root2, realPart, imagPart;

        Scanner scanner = new Scanner(System.in);

        // Input the coefficients
        System.out.print("Enter coefficients a, b and c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        // Calculate the discriminant
        discriminant = b * b - 4 * a * c;

        // Condition for real and different roots
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        // Condition for real and equal roots
        else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.printf("root1 = root2 = %.2f", root1);
        }
        // If roots are not real==  discriminant < 0
        else {
            realPart = -b / (2 * a);
            imagPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("root1 = %.2f + %.2fi and root2 = %.2f - %.2fi", realPart, imagPart, realPart, imagPart);
        }

        scanner.close();
    }
}
