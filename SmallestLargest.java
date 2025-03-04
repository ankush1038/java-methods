import java.util.Scanner;

public class SmallestLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Check for the smallest number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Check for the largest number
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for three numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Call the method and store the result
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Display the smallest and largest number
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        sc.close();
    }
}
