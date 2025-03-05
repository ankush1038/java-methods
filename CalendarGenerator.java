import java.util.Scanner;

public class CalendarGenerator {
    
    // Array to store month names
    private static final String[] MONTHS = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    // Array to store number of days in each month
    private static final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int year, int month) {
        if (month < 3) {
            year--;
            month += 12;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }
    
    // Method to print the calendar for a given month and year
    public static void printCalendar(int year, int month) {
        System.out.println("\n   " + MONTHS[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        int daysInMonth = DAYS_IN_MONTH[month];
        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        }
        
        int firstDay = getFirstDayOfMonth(year, month);
        
        // Print leading spaces for first day alignment
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {
            printCalendar(year, month);
        }
        scanner.close();
    }
}