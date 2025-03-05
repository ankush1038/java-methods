import java.util.Scanner;

public class NumberCheck {

    // Finds the count of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Stores the digits of the number in an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    // Finds the sum of digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Finds the sum of squares of digits using Math.pow()
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Checks if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Finds the frequency of each digit in the number using a 2D array
    public static int[][] digitFrequency(int number) {
        int[] frequency = new int[10]; // Array to count frequency of each digit (0-9)

        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2]; // 2D array to store digit and its frequency
        int index = 0;

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);
        
        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        int[][] frequency = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int[] row : frequency) {
            System.out.println("Digit: " + row[0] + " - Frequency: " + row[1]);
        }

        sc.close();
    }
}
