import java.util.Scanner;

public class EuclideanSlopeFormulae {
    
    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    // Method to calculate the equation of the line (slope and y-intercept)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        
        // Calculate slope m
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept b
        double b = y1 - (m * x1);
        
        result[0] = m;
        result[1] = b;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        
        // Calculate and display Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        // Calculate and display line equation
        if (x1 != x2) { // Ensure the line is not vertical
            double[] lineEquation = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        } else {
            System.out.println("The line is vertical, equation: x = " + x1);
        }
        
        sc.close();
    }
}
