import java.util.Random;

public class FootballHeightStats {
    
    // Method to calculate the sum of all player heights
    public static int getSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height of players
    public static double getMean(int[] heights) {
        return (double) getSum(heights) / heights.length;
    }

    // Method to find the shortest player height
    public static int getShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest player height
    public static int getTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Create an array to store player heights
        int[] heights = new int[11];

        // Create a Random object to generate random heights
        Random rand = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        // Display the heights of all players
        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Display calculated statistics
        System.out.println("Sum of Heights: " + getSum(heights));
        System.out.println("Mean Height: " + getMean(heights) + " cm");
        System.out.println("Shortest Height: " + getShortest(heights) + " cm");
        System.out.println("Tallest Height: " + getTallest(heights) + " cm");
    }
}
