public class UnitConverting {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilogramsFactor = 0.453592;
        return pounds * poundsToKilogramsFactor;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPoundsFactor = 2.20462;
        return kilograms * kilogramsToPoundsFactor;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLitersFactor = 3.78541;
        return gallons * gallonsToLitersFactor;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallonsFactor = 0.264172;
        return liters * litersToGallonsFactor;
    }

    public static void main(String[] args) {
        // Example conversions
        double fahrenheit = 98.6;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.0;
        double gallons = 5.0;
        double liters = 10.0;

        System.out.println(fahrenheit + " °F = " + convertFahrenheitToCelsius(fahrenheit) + " °C");
        System.out.println(celsius + " °C = " + convertCelsiusToFahrenheit(celsius) + " °F");
        System.out.println(pounds + " lbs = " + convertPoundsToKilograms(pounds) + " kg");
        System.out.println(kilograms + " kg = " + convertKilogramsToPounds(kilograms) + " lbs");
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
