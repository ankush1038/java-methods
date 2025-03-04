import java.util.Scanner;

public class FactorsCalculator {

    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the correct size
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        int length = factors.length;
        
        for (int i = 0; i < length; i++) {
            sum += factors[i];
        }
        
        return sum;
    }

    // Method to calculate the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        int length = factors.length;
        
        for (int i = 0; i < length; i++) {
            product *= factors[i];
        }
        
        return product;
    }

    // Method to calculate the sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        int length = factors.length;
        
        for (int i = 0; i < length; i++) {
            sum += Math.pow(factors[i], 2);
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        int length = factors.length;
        
        for (int i = 0; i < length; i++) {
            System.out.print(factors[i] + " ");
        }
        
        System.out.println();

        // Compute and display results
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Sum of Squares of Factors: " + sumOfSquaresOfFactors(factors));

        sc.close();
    }
}
