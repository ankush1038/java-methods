import java.util.Scanner;  // Import Scanner class

public class RunCalculator {

    // Method to calculate the number of rounds required
    public static int calculateRounds(int side1, int side2, int side3) {
	
		// Calculate perimeter
        int perimeter = side1 + side2 + side3;  
        if (perimeter <= 0) {
            System.out.println("Invalid input! Sides must be positive.");
            return 0;
        }

        int totalDistance = 5000; 
        int rounds = totalDistance / perimeter;  

        // If there is a remainder, add one more round
        if (totalDistance % perimeter != 0) {
            rounds++;
        }

        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for three sides of the triangular park
        System.out.print("Enter the first side of the triangular park (in meters): ");
        int side1 = sc.nextInt();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        int side2 = sc.nextInt();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        int side3 = sc.nextInt();

        // Compute and display the required number of rounds
        int rounds = calculateRounds(side1, side2, side3);
        if (rounds > 0) {
            System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
        }

        sc.close();
    }
}
