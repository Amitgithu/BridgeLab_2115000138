import java.util.Random;

class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix1 = generateMatrix(2, 2);
        int[][] matrix1 = generateMatrix(2, 2);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix1);

        System.out.println("Matrix Addition:");
        displayMatrix(addMatrices(matrix1, matrix1));

        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix1));

        System.out.println("Matrix Multiplication:");
        displayMatrix(multiplyMatrices(matrix1, matrix1));
    }

    public static int[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix1) {
        int rows = matrix1.length, cols = matrix1[0].length, common = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix1[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix1) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix1[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix1) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix1[i][j];
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

}

