import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
	
		// Combination formula
        return (n * (n - 1)) / 2;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Check if there are at least two students for a handshake
        if (n < 2) {
            System.out.println("At least two students are required for a handshake.");
        } else {
		
            // Calculate and display the maximum handshakes
            int maxHandshakes = calculateHandshakes(n);
            System.out.println("The maximum number of handshakes possible is: " + maxHandshakes);
        }

        sc.close();
    }
}
