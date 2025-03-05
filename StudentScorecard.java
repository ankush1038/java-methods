import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Define a 2D array to store Physics, Chemistry, Math scores
        int[][] scores = new int[n][3];
        int[][] results = new int[n][3]; // Stores total, average, and percentage

        // Generate random 2-digit scores
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics
            scores[i][1] = 40 + random.nextInt(61); // Chemistry
            scores[i][2] = 40 + random.nextInt(61); // Math
        }

        // Calculate total, average, and percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = (int) Math.round(average);
            results[i][2] = (int) Math.round(percentage);
        }

        // Display the scorecard
        System.out.println("\nStudent Scorecard:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("----------------------------------------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10d %-10d %-10d\n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], results[i][2]);
        }

        sc.close();
    }
}
