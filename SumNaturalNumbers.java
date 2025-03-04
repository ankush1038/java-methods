import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to find sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Error: Please enter a positive natural number!");
            sc.close();
            return;
        }

        // Compute sum using recursion
        int sumRecursion = sumUsingRecursion(n);

        // Compute sum using formula
        int sumFormula = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using Recursion: " + sumRecursion);
        System.out.println("Sum using Formula: " + sumFormula);

        // Check if both results match
        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the same result. Computation is correct!");
        } else {
            System.out.println("Mismatch! There is an error in computation.");
        }

        sc.close();
    }
}
