import java.util.Scanner;

public class NumberAnalyzer {

    // Method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in); 
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nAnalysis of numbers:");
        
        // Analyzing numbers
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive");
                if (isEven(numbers[i])) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Comparing first and last elements
        int comparisonResult = compare(numbers[0], numbers[4]);

        System.out.print("\nComparison of first and last number: ");
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First and last number are equal.");
        } else {
            System.out.println("First number is less than the last number.");
        }

        sc.close(); 
    }
}
