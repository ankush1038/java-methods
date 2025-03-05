public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to validate uniqueness of OTPs without additional data structures
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate OTP found
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in an array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP: " + otps[i]);
        }

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found!");
        }
    }
}
