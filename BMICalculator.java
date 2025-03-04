import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100;
        return weight / (heightMeters * heightMeters);
    }

    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        double[][] bmiData = new double[10][3];
        String[] bmiStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = sc.nextDouble();

            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);

            bmiStatus[i] = determineBMIStatus(bmiData[i][2]);
        }

        System.out.println("BMI Results:");
        System.out.println("Person  Weight (kg)  Height (cm)  BMI  Status");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "  ");
            System.out.print(bmiData[i][0] + "  ");
            System.out.print(bmiData[i][1] + "  ");
            System.out.print(bmiData[i][2] + "  ");
            System.out.println(bmiStatus[i]);
        }

        sc.close();
    }
}
