import java.util.Random;
public class level3Q13 {

    public static void main(String[] args) {
        int rows1 = 3, cols1 = 3;
        int rows2 = 3, cols2 = 3;
        int[][] matrix1 = createRandomMatrix(rows1, cols1);
        int[][] matrix2 = createRandomMatrix(rows2, cols2);
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        int[][] sum = addMatrices(matrix1, matrix2);
        int[][] difference = subtractMatrices(matrix1, matrix2);
        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("Sum:");
        displayMatrix(sum);
        System.out.println("Difference:");
        displayMatrix(difference);
        System.out.println("Product:");
        displayMatrix(product);
        int[][] transpose1 = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transpose1);
        if (rows1 == 3 && cols1 == 3) {
            int determinant1 = determinant3x3(matrix1);
            System.out.println("Determinant of Matrix 1: " + determinant1);
        }
        if (rows1 == 2 && cols1 == 2) {
            int[][] inverse1 = inverse2x2(matrix1);
            if (inverse1 != null) {
                System.out.println("Inverse of Matrix 1:");
                displayMatrix(inverse1);
            } else {
                System.out.println("Matrix 1 is singular (no inverse exists).");
            }
        }
    }
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }
        return matrix;
    }
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices have incompatible dimensions for addition.");
            return null;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices have incompatible dimensions for subtraction.");
            return null;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices have incompatible dimensions for multiplication.");
            return null;
        }

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    public static int[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            return null;
        }

        int[][] inverse = new int[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
