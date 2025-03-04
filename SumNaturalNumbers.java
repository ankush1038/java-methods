import java.util.Scanner;  

public class SumNaturalNumbers {

    // Method to calculate sum of first N natural numbers using a loop
    public static int findSum(int n) {
        int sum = 0; 
        for (int i = 1; i <= n; i++) {  
            sum += i; 
        }
		// Return the calculated sum
        return sum;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if the input is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Call method and print the result
            int sum = findSum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }

        sc.close();
    }
}
