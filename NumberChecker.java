import java.util.Scanner;

public class NumberChecker {

    // Counts the number of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Checks if a number is a Duck number (contains zero but does not start with zero)
    public static boolean isDuckNumber(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    // Checks if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = countDigits(number);

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Finds the largest and smallest digits in a number
    public static int[] findLargestAndSmallest(int number) {
        int largest = 0;
        int smallest = 9;

        while (number > 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            if (digit < smallest) {
                smallest = digit;
            }
            number /= 10;
        }

        return new int[]{largest, smallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        int[] result = findLargestAndSmallest(number);
        System.out.println("Largest Digit: " + result[0]);
        System.out.println("Smallest Digit: " + result[1]);

        sc.close();
    }
}
