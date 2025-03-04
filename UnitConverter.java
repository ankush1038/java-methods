public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double kilometers) {
        double kmToMilesFactor = 0.621371;
        return kilometers * kmToMilesFactor;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKmFactor = 1.60934;
        return miles * milesToKmFactor;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeetFactor = 3.28084;
        return meters * metersToFeetFactor;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMetersFactor = 0.3048;
        return feet * feetToMetersFactor;
    }

    public static void main(String[] args) {
        // Example conversions
        double kilometers = 10.0;
        double miles = 5.0;
        double meters = 100.0;
        double feet = 50.0;

        System.out.println(kilometers + " km = " + convertKmToMiles(kilometers) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}
