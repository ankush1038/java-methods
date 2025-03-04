import java.util.Scanner;

public class QuotientRemainder {

    // Method to find the quotient and remainder of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number and divisor
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Check if divisor is zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Call the method and store the result
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the quotient and remainder
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        sc.close();
    }
}
