import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    
    // Method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers from 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, common = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to calculate determinant of 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to calculate determinant of 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to calculate inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse does not exist.");
            return null;
        }
        double[][] inverse = {
            { matrix[1][1] / (double) det, -matrix[0][1] / (double) det },
            { -matrix[1][0] / (double) det, matrix[0][0] / (double) det }
        };
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows and columns for matrices: ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        int[][] matrixA = generateMatrix(rows, cols);
        int[][] matrixB = generateMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        System.out.println("\nMatrix Addition:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nMatrix Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        if (cols == rows) {
            System.out.println("\nMatrix Multiplication:");
            displayMatrix(multiplyMatrices(matrixA, matrixB));

            System.out.println("\nMatrix Transpose:");
            displayMatrix(transposeMatrix(matrixA));

            if (rows == 2 && cols == 2) {
                System.out.println("\nDeterminant of 2x2 Matrix: " + determinant2x2(matrixA));
                System.out.println("\nInverse of 2x2 Matrix:");
                double[][] inverse = inverse2x2(matrixA);
                if (inverse != null) displayMatrix(inverse);
            } else if (rows == 3 && cols == 3) {
                System.out.println("\nDeterminant of 3x3 Matrix: " + determinant3x3(matrixA));
            }
        } else {
            System.out.println("\nMultiplication and determinant calculations require square matrices.");
        }

        sc.close();
    }
}
