import java.util.Scanner;  

public class SpringSeason {

    // Method to check if the given date is in Spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||  
            (month == 4 && day >= 1 && day <= 30) ||  
            (month == 5 && day >= 1 && day <= 31) ||  
            (month == 6 && day >= 1 && day <= 20)) {  
            return true;  
        } 
        return false;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        // Check if it's Spring Season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
