import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of a given angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        // Call the method and store the results
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        sc.close();
    }
}
