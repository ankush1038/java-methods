import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Returns true if age is 18 or above
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Taking input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Checking voting eligibility
        for (int i = 0; i < 10; i++) {
            boolean eligible = canStudentVote(studentAges[i]);
            if (studentAges[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered.");
            } else if (eligible) {
                System.out.println("Student " + (i + 1) + ": Eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + ": Not eligible to vote.");
            }
        }

        scanner.close();
    }
}
