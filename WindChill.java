import java.util.Scanner;

public class WindChill {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        // Take user input for wind speed
        System.out.print("Enter wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        // Check for valid input conditions
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind Chill formula is valid only for temperatures ≤ 50°F and wind speeds ≥ 3 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.println("The Wind Chill Temperature is: " + windChill + "°F");
        }

        sc.close();
    }
}
