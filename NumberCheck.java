import java.util.Scanner;  // Import Scanner class

public class NumberCheck {

    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;  
        } else if (num < 0) {
            return -1; 
        } else {
            return 0;  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Call method and store the result
        int result = checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
