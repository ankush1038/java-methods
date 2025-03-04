import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a Leap Year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;  // Gregorian calendar starts from 1582
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Validate input and check if it's a Leap Year
        if (year < 1582) {
            System.out.println("Error: Year must be 1582 or later (Gregorian calendar).");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}
