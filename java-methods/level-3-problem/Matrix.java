
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input dimensions for matrices
        System.out.print("Enter number of rows for matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int cols = sc.nextInt();

        // Create two random matrices
        double[][] matrixA = createRandomMatrix(rows, cols);
        double[][] matrixB = createRandomMatrix(rows, cols);

        // Display the matrices
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Perform operations
        double[][] sum = addMatrices(matrixA, matrixB);
        double[][] difference = subtractMatrices(matrixA, matrixB);
        double[][] product = multiplyMatrices(matrixA, matrixB);
        double[][] transposeA = transposeMatrix(matrixA);
        double[][] transposeB = transposeMatrix(matrixB);

        // Display results
        System.out.println("Sum of A and B:");
        displayMatrix(sum);
        System.out.println("Difference of A and B:");
        displayMatrix(difference);
        System.out.println("Product of A and B:");
        displayMatrix(product);
        System.out.println("Transpose of A:");
        displayMatrix(transposeA);
        System.out.println("Transpose of B:");
        displayMatrix(transposeB);

        // Determinant and Inverse for 2x2 and 3x3 matrices
        if (rows == 2 && cols == 2) {
            System.out.println("Determinant of A: " + determinant2x2(matrixA));
            System.out.println("Inverse of A:");
            displayMatrix(inverse2x2(matrixA));
        } else if (rows == 3 && cols == 3) {
            System.out.println("Determinant of A: " + determinant3x3(matrixA));
            System.out.println("Inverse of A:");
            displayMatrix(inverse3x3(matrixA));
        }

    }

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (Math.random()*10+1); 
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        double[][] result = new double[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }
        double[][] inverse = new double[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / determinant;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / determinant;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / determinant;
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / determinant;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / determinant;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / determinant;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / determinant;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / determinant;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / determinant;
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }
}
