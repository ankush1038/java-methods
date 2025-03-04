public class UnitConverterYards {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeetFactor = 3;
        return yards * yardsToFeetFactor;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYardsFactor = 0.333333;
        return feet * feetToYardsFactor;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInchesFactor = 39.3701;
        return meters * metersToInchesFactor;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMetersFactor = 0.0254;
        return inches * inchesToMetersFactor;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCmFactor = 2.54;
        return inches * inchesToCmFactor;
    }

    public static void main(String[] args) {
        // Example conversions
        double yards = 5.0;
        double feet = 15.0;
        double meters = 2.0;
        double inches = 10.0;

        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " cm");
    }
}
